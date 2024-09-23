package com.teamwccg.well_c_cogit_backend.entity.region;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// Region Entity
@Entity
@Table(name = "region")
@Getter
@Setter
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // 지역 ID
    private Integer id;

    @Column(name = "name_depth1", nullable = false) // 행정 시,도 (예: 서울, 충북)
    private String nameDepth1;

    @Column(name = "name_depth2") // 행정 구,시 (없을 경우 null 가능)
    private String nameDepth2; // (예: 관악구)

    @Column(name = "name_depth3", nullable = false) // 행정 동,면 (예: 조원동)
    private String nameDepth3;

    @Column(name = "y") // 위도
    private Double y;

    @Column(name = "x") // 경도
    private Double x;

    @Column(name = "road_address_name") // 도로명주소
    private String roadAddressName; // 지역 검색 시 null 가능

    @Column(name = "address_name") // 지번주소
    private String addressName; // 지역 검색 시 null 가능
}
