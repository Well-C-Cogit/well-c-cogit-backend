package com.teamwccg.well_c_cogit_backend.dto.ResponseDTO.group;

import com.teamwccg.well_c_cogit_backend.dto.ResponseDTO.medal.MedalInfoDTO;
import com.teamwccg.well_c_cogit_backend.dto.ResponseDTO.user.UserInfoSimpleDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class GroupInfoSimpleDTO {
    private String name; // 모임명
    private String groupImageUrl; // 모임 대표 사진
    private String region; // 모임 활동 지역
    private int totalMemberCount; // 총 멤버 수
    private MedalInfoDTO recentMedal; // 모임 최근 수여 메달
}
