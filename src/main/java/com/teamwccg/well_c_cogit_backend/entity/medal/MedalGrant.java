package com.teamwccg.well_c_cogit_backend.entity.medal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// MedalGrant Entity
@Entity
@Table(name = "medal_grant")
@Getter
@Setter
public class MedalGrant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // 메달 수여 ID
    private Integer id;

    @Column(name = "medal_id") // 메달 ID
    private Integer medalId;

    @Column(name = "target_id") // 대상 ID (회원 또는 모임)
    private Integer targetId;

    @Column(name = "type") // 유형 (ENUM: 회원, 모임)
    private String type;

    @Column(name = "name") // 수여 이름 (예: N월 N주차 상위 30)
    private String name;

    @Column(name = "granted_at", nullable = false) // 수여일
    private LocalDateTime grantedAt;

    @Column(name = "count_by_days") // N일마다 지급되는 수여 수량
    private Integer countByDays;

    @Column(name = "created_at", nullable = false) // 생성일
    private LocalDateTime createdAt;
}
