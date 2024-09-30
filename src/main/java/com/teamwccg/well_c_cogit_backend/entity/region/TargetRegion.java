package com.teamwccg.well_c_cogit_backend.entity.region;

import com.teamwccg.well_c_cogit_backend.enums.targetEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// 타겟 지역
@Entity
@Table(name = "target_region")
@Getter
@Setter
public class TargetRegion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false) // 타겟 지역 id
    private int id;

    @Column(name = "region_id", nullable = false) // 지역 id
    private int regionId;

    @Column(name = "target_id", nullable = false) // 타겟 id (회원 또는 모임)
    private int targetId;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false) // 유형 (ENUM: 회원, 모임)
    private targetEnum.targetType type;
}
