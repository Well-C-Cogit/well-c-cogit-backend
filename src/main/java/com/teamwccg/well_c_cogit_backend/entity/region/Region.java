package com.teamwccg.well_c_cogit_backend.entity.region;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// 지역
@Entity
@Table(name = "region")
@Getter
@Setter
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false) // 지역 ID
    private int id;

    @Column(name = "name_depth1", nullable = false, length = 10) // 행정 시,도 (예: 서울, 충북, 세종특별자치시)
    private String nameDepth1;

    @Column(name = "name_depth2", nullable = true, length = 10) // 행정 구,시 (예: 관악구, 제천시) (없는 경우 존재 -> null)
    private String nameDepth2;

    @Column(name = "name_depth3", nullable = false, length = 10) // 행정 동,면 (예: 조원동, 신백동, 연서면)
    private String nameDepth3;

    @Column(name = "y", nullable = false) // 위도
    private Double y;

    @Column(name = "x", nullable = false) // 경도
    private Double x;

    @Column(name = "road_address_name", nullable = true, length = 50) // 도로명주소 (지역 검색 시 null)
    private String roadAddressName;

    @Column(name = "address_name", nullable = true, length = 50) // 지번주소 (지역 검색 시 null)
    private String addressName;
}
