package com.teamwccg.well_c_cogit_backend.entity.post;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// 게시글
@Entity
@Table(name = "post")
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false) // 게시글 id
    private int id;

    @Column(name = "group_id", nullable = false) // 모임 id
    private int groupId;

    @Column(name = "user_id", nullable = false) // 회원 id
    private int userId;

    @Column(name = "content", nullable = false, length = 200) // 내용
    private String content;

    @Column(name = "created_at", nullable = false) // 등록일
    private LocalDateTime createdAt;
}
