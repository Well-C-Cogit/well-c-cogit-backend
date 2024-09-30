package com.teamwccg.well_c_cogit_backend.dto.ResponseDTO.medal;

import com.teamwccg.well_c_cogit_backend.enums.MedalEnum;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class MedalInfoDTO {
    private String name; // 메달이름
    private MedalEnum.medalTier tier; // 메달 티어
    private LocalDateTime grantedAt; // 메달 수여 날짜
}
