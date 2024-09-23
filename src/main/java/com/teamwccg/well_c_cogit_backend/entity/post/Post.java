package com.teamwccg.well_c_cogit_backend.entity.post;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// Post Entity
@Entity
@Table(name = "post")
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // 게시글 ID
    private Integer id;

    @Column(name = "group_id") // 그룹 ID
    private Integer groupId;

    @Column(name = "user_id") // 사용자 ID
    private Integer userId;

    @Column(name = "content", nullable = false) // 게시글 내용
    private String content;

    @Column(name = "created_at", nullable = false) // 생성일
    private LocalDateTime createdAt;
}
