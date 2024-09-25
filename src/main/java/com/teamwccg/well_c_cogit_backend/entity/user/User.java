package com.teamwccg.well_c_cogit_backend.entity.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
//회원
@Entity
@Getter
@Setter
@ToString
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false) // 회원 id
    private int id;

    @Column(name = "github_id", nullable = false, length = 39) // 깃허브 id
    private String githubId;

    @Column(name = "name", nullable = false, length = 39) // 이름(깃허브 닉네임)
    private String name;

    @Column(name = "introduce", nullable = true, length = 200) // 소개
    private String introduce;

    @Column(name = "profile_image_url", nullable = true, length = 200) // 프로필 이미지 URL (이미지 주소)
    private String profileImageUrl;

    @Column(name = "main_language", nullable = true, length = 30) // 주 사용 언어
    private String mainLanguage;

    @Column(name = "created_at", nullable = false) // 등록일
    private LocalDateTime createdAt;
}
