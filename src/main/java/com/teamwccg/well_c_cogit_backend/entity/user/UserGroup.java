package com.teamwccg.well_c_cogit_backend.entity.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// UserGroup Entity
@Entity
@Table(name = "user_group")
@Getter
@Setter
public class UserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // 사용자 그룹 ID
    private Integer id;

    @Column(name = "user_id") // 사용자 ID
    private String userId;

    @Column(name = "group_id") // 그룹 ID
    private Integer groupId;

    @Column(name = "created_at", nullable = false) // 생성일
    private LocalDateTime createdAt;
}
