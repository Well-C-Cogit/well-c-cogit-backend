package com.teamwccg.well_c_cogit_backend.entity.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// UserGroupInvite Entity
@Entity
@Table(name = "user_group_invite")
@Getter
@Setter
public class UserGroupInvite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // 초대 ID
    private Integer id;

    @Column(name = "group_id") // 그룹 ID
    private Integer groupId;

    @Column(name = "invite_user_id") // 초대한 사용자 ID
    private String inviteUserId;

    @Column(name = "invited_user_id") // 초대받은 사용자 ID
    private String invitedUserId;

    @Column(name = "email") // 초대 이메일
    private String email;

    @Column(name = "state", nullable = false) // 초대 상태 (ENUM: 대기, 승인, 거절)
    private String state;

    @Column(name = "created_at", nullable = false) // 생성일
    private LocalDateTime createdAt;
}
