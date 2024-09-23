package com.teamwccg.well_c_cogit_backend.entity.post;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// Comment Entity
@Entity
@Table(name = "comment")
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // 댓글 ID
    private Integer id;

    @Column(name = "post_id") // 게시글 ID
    private Integer postId;

    @Column(name = "user_id") // 사용자 ID
    private String userId;

    @Column(name = "content", nullable = false) // 댓글 내용
    private String content;

    @Column(name = "created_at", nullable = false) // 생성일
    private LocalDateTime createdAt;
}
