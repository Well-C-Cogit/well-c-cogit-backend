package com.teamwccg.well_c_cogit_backend.entity.commit;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// (wccg) 리포지토리
@Entity
@Table(name = "wccg_repository")
@Getter
@Setter
public class WccgRepository {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // 리포지토리 id
    private int id;

    @Column(name = "name", nullable = false, length = 100) // 이름
    private String name;

    @Column(name = "owner", nullable = false, length = 39) // 소유자 (조직용이면 조직 이름 / 사용자면 사용자 이름)
    private String owner;

    @Column(name = "created_at", nullable = false) // 등록일
    private LocalDateTime createdAt;

    @Column(name = "is_active", nullable = false) // 활성화 여부
    private Boolean isActive;
}
