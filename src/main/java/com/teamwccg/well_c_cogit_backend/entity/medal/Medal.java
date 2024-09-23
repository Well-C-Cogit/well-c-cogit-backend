package com.teamwccg.well_c_cogit_backend.entity.medal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// Medal Entity
@Entity
@Table(name = "medal")
@Getter
@Setter
public class Medal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // 메달 ID
    private Integer id;

    @Column(name = "name") // 메달 이름
    private String name;

    @Column(name = "tier") // 메달 등급 (ENUM: 브론즈, 실버, 골드 등)
    private String tier;

    @Column(name = "introduce") // 메달 소개 (예: 100일 연속 커밋)
    private String introduce;

    @Column(name = "type") // 수여 대상 구분 (ENUM: 유저, 그룹, 모두)
    private String type;

    @Column(name = "created_at", nullable = false) // 생성일
    private LocalDateTime createdAt;
}
