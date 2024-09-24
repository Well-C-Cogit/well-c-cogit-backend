package com.teamwccg.well_c_cogit_backend.entity.user;

import com.teamwccg.well_c_cogit_backend.entity.Enum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// 회원 모임 초대
@Entity
@Table(name = "user_group_invite")
@Getter
@Setter
public class UserGroupInvite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false) // 회원 모임 초대 id
    private int id;

    @Column(name = "group_id", nullable = false) // 모임 id
    private int groupId;

    @Column(name = "invite_user_id", nullable = false) // 초대 한 회원 id
    private int inviteUserId;

    @Column(name = "invited_user_id", nullable = true) // 초대 받은 회원 id
    private int invitedUserId;

    @Column(name = "email", nullable = true, length = 40) // 초대 이메일
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "state", nullable = false) // 상태 (ENUM: 대기, 승인, 거절)
    private Enum.inviteState state;

    @Column(name = "created_at", nullable = false) // 생성일
    private LocalDateTime createdAt;

}
