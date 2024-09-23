package com.teamwccg.well_c_cogit_backend.entity.token;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// Token Entity
@Entity
@Table(name = "token")
@Getter
@Setter
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // 토큰 ID
    private Integer id;

    @Column(name = "user_id") // 사용자 ID
    private Integer userId;

    @Column(name = "access_token", nullable = false) // 액세스 토큰
    private String accessToken;

    @Column(name = "created_at", nullable = false) // 생성일
    private LocalDateTime createdAt;
}
