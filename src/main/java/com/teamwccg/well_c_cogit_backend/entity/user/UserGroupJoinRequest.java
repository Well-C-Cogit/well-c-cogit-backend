package com.teamwccg.well_c_cogit_backend.entity.user;

import com.teamwccg.well_c_cogit_backend.enums.GroupEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// 회원 모임 가입 요청
@Entity
@Table(name = "user_group_join_request")
@Getter
@Setter
public class UserGroupJoinRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false) // 회원 모임 가입 요청 id
    private int id;

    @Column(name = "user_id", nullable = false) // 회원 id
    private int userId;

    @Column(name = "group_id", nullable = false) // 모임 id
    private int groupId;

    @Enumerated(EnumType.STRING)
    @Column(name = "state", nullable = false) // 상태 (ENUM: 대기, 승인, 거절)
    private GroupEnum.groupJoinState state;

    @Column(name = "created_at", nullable = false) // 등록일
    private LocalDateTime createdAt;
}
