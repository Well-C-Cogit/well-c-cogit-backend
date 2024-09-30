package com.teamwccg.well_c_cogit_backend.entity.group;

import com.teamwccg.well_c_cogit_backend.enums.GroupEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;
// 모임
@Entity
@Getter
@Setter
@ToString
@Table(name = "wccg_group")
public class WccgGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false) // 모임 id
    private int id;

    @Column(name = "group_master_id", nullable = false) // 모임장 id
    private int groupMasterId;

    @Column(name = "name", nullable = false, length = 20) // 이름
    private String name;

    @Column(name = "introduce", nullable = true, length = 200) // 소개
    private String introduce;

    @Column(name = "last_active_time", nullable = false)
    private LocalDateTime lastActiveTime; // 마지막 활동 시간

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)  // 유형 (ENUM: 기본, 스터디)
    private GroupEnum.groupType type;

    @Column(name = "group_image_url", nullable = true, length = 200)
    private String groupImageUrl;

    @Column(name = "created_at", nullable = false) // 등록일
    private LocalDateTime createdAt;
}
