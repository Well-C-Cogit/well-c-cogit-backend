package com.teamwccg.well_c_cogit_backend.entity.commit;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// WccgRepository Entity
@Entity
@Table(name = "repository")
@Getter
@Setter
public class WccgRepository {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // 리포지토리 ID
    private Integer id;

    @Column(name = "name") // 리포지토리 이름
    private String name;

    @Column(name = "owner") // 소유자
    private String owner;

    @Column(name = "created_at", nullable = false) // 생성일
    private LocalDateTime createdAt;

    @Column(name = "is_active", nullable = false) // 활성 상태
    private Boolean isActive;
}
