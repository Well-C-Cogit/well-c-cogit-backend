package com.teamwccg.well_c_cogit_backend.controller;

import com.teamwccg.well_c_cogit_backend.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ApiController {

    private final ApiService apiService;

    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/locationSearch")
    public Map<String, Object> searchLocations(@RequestParam String query) {
        return apiService.searchLocations(query);
    }
}
