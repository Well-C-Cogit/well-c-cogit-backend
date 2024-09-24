package com.teamwccg.well_c_cogit_backend.entity.post;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

//댓글
@Entity
@Table(name = "comment")
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false) // 댓글 id
    private int id;

    @Column(name = "post_id", nullable = false) // 게시글 id
    private int postId;

    @Column(name = "user_id", nullable = false, length = 39) // 회원 id
    private String userId;

    @Column(name = "content", nullable = false, length = 50) // 내용
    private String content;

    @Column(name = "created_at", nullable = false) // 등록일
    private LocalDateTime createdAt;
}
