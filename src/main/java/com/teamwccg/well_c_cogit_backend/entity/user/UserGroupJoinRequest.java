package com.teamwccg.well_c_cogit_backend.entity.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// UserGroupJoinRequest Entity
@Entity
@Table(name = "user_group_join_request")
@Getter
@Setter
public class UserGroupJoinRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // 가입 요청 ID
    private Integer id;

    @Column(name = "user_id") // 사용자 ID
    private Integer userId;

    @Column(name = "group_id") // 그룹 ID
    private Integer groupId;

    @Column(name = "state", nullable = false) // 요청 상태 (ENUM: 대기, 승인, 거절)
    private String state;

    @Column(name = "created_at", nullable = false) // 생성일
    private LocalDateTime createdAt;
}
