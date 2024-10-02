package com.teamwccg.well_c_cogit_backend.entity.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// 회원 모임
@Entity
@Table(name = "user_group", indexes = {
        @Index(name = "idx_user_id", columnList = "user_id") // userId 필드에 인덱스 추가
})
@Getter
@Setter
public class UserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false) // 회원 모임 id
    private int id;

    @Column(name = "user_id", nullable = false) // 회원 id
    private int userId;

    @Column(name = "group_id", nullable = false) // 모임 id
    private int groupId;

    @Column(name = "created_at", nullable = false) // 등록일
    private LocalDateTime createdAt;
}
