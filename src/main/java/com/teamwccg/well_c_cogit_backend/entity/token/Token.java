package com.teamwccg.well_c_cogit_backend.entity.token;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// 토큰
@Entity
@Table(name = "token")
@Getter
@Setter
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false) // 토큰 id
    private int id;

    @Column(name = "user_id", nullable = false) // 회원 id
    private int userId;

    @Column(name = "access_token", nullable = false, length = 255) // 액세스 토큰
    private String accessToken;

    @Column(name = "created_at", nullable = false) // 등록일
    private LocalDateTime createdAt;
}
