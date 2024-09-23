package com.teamwccg.well_c_cogit_backend.entity.region;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// TargetRegion Entity
@Entity
@Table(name = "target_region")
@Getter
@Setter
public class TargetRegion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // 타겟 지역 ID
    private Integer id;

    @Column(name = "region_id") // 지역 ID
    private Integer regionId;

    @Column(name = "target_id") // 대상 ID (회원 또는 모임)
    private Integer targetId;

    @Column(name = "type") // 유형 (ENUM: 회원, 모임)
    private String type;
}
