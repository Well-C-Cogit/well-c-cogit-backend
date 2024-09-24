package com.teamwccg.well_c_cogit_backend.entity.medal;

import com.teamwccg.well_c_cogit_backend.entity.Enum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// 메달
@Entity
@Table(name = "medal")
@Getter
@Setter
public class Medal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false) // 메달 id
    private int id;

    @Column(name = "name", nullable = false, length = 20) // 메달 이름
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "tier", nullable = false) // 메달 등급 (ENUM: 브론즈, 실버, 골드 등)
    private Enum.medalTier tier;

    @Column(name = "introduce", nullable = true, length = 200) // 메달 소개 (예: 100일 연속 커밋)
    private String introduce;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false) // 수여 대상 구분 (ENUM: 유저, 그룹, 모두)
    private Enum.targetTypeAll type;

    @Column(name = "created_at", nullable = false) // 생성일
    private LocalDateTime createdAt;
}
