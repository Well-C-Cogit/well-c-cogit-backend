package com.teamwccg.well_c_cogit_backend.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class ApiService {

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    public ApiService(RestTemplate restTemplate, ObjectMapper objectMapper) {
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
    }

    // 지역 검색 후, 지역 없으면 건물 검색 후 반환
    public Map<String, Object> searchLocations(String query) {
        Map<String, Object> result = searchAddress(query);

        // 지역 검색 결과가 없으면 건물 검색 실행
        if (result.get("addressResults") == null || ((List<?>) result.get("addressResults")).isEmpty()) {
            Map<String, Object> placeResults = searchPlace(query);
            result.put("placeResults", placeResults.get("placeResults"));
        }

        return result;
    }

    // 지역 검색
    public Map<String, Object> searchAddress(String query) {
        Map<String, Object> result = new HashMap<>();
        List<String> addressList = new ArrayList<>();

        // 지역 검색
        String addressApiUrl = "https://dapi.kakao.com/v2/local/search/address.json?query=" + query;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "KakaoAK c85798dc4a6eb622cd65968e374eff9c");

        ResponseEntity<String> addressResponse = restTemplate.exchange(addressApiUrl, HttpMethod.GET,
                new org.springframework.http.HttpEntity<>(headers), String.class);

        try {
            JsonNode addressRootNode = objectMapper.readTree(addressResponse.getBody());
            JsonNode addressDocuments = addressRootNode.path("documents");

            for (JsonNode document : addressDocuments) {
                JsonNode addressNode = document.path("address");
                String region3depthHName = addressNode.path("region_3depth_h_name").asText(null);

                // region3depthHName이 null 또는 빈 문자열일 경우 빈 문자열로 대체
                if (region3depthHName != null && !region3depthHName.isEmpty() && addressList.size() < 5) {
                    addressList.add(document.path("address_name").asText());
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("RuntimeException", e);
        }

        // 결과 설정
        result.put("addressResults", addressList);

        return result;
    }

    // 장소 검색
    public Map<String, Object> searchPlace(String query) {
        Map<String, Object> result = new HashMap<>();
        List<String> placeList = new ArrayList<>();

        // 건물 검색
        String placeApiUrl = "https://dapi.kakao.com/v2/local/search/keyword.json?query=" + query;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "KakaoAK c85798dc4a6eb622cd65968e374eff9c");

        ResponseEntity<String> placeResponse = restTemplate.exchange(placeApiUrl, HttpMethod.GET,
                new org.springframework.http.HttpEntity<>(headers), String.class);

        try {
            JsonNode placeRootNode = objectMapper.readTree(placeResponse.getBody());
            JsonNode placeDocuments = placeRootNode.path("documents");

            for (JsonNode document : placeDocuments) {
                if (placeList.size() < 5) {
                    placeList.add(document.path("place_name").asText());
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("RuntimeException", e);
        }

        // 결과 설정
        result.put("placeResults", placeList);

        return result;
    }
}