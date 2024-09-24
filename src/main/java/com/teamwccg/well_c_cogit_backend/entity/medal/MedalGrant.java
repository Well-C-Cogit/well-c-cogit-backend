package com.teamwccg.well_c_cogit_backend.entity.medal;

import com.teamwccg.well_c_cogit_backend.entity.Enum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// 메달 수여
@Entity
@Table(name = "medal_grant")
@Getter
@Setter
public class MedalGrant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false) // 메달 수여 id
    private Integer id;

    @Column(name = "medal_id", nullable = false) // 메달 id
    private Integer medalId;

    @Column(name = "target_id", nullable = false) // 타겟 id (회원 id 또는 모임 id)
    private Integer targetId;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false) // 유형 (ENUM: 회원, 모임)
    private Enum.targetType type;

    @Column(name = "name", nullable = false, length = 50) // 수여 이름 (예: N월 N주차 상위 30)
    private String name;

    @Column(name = "granted_at", nullable = false) // 수여일
    private LocalDateTime grantedAt;

    @Column(name = "count_by_days", nullable = true) // 기준 일수(수여일 기준 N일마다 지급)
    private int countByDays;

    @Column(name = "created_at", nullable = false) // 생성일
    private LocalDateTime createdAt;
}
