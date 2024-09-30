package com.teamwccg.well_c_cogit_backend.dto.ResponseDTO.user;

import com.teamwccg.well_c_cogit_backend.enums.ProgrammingLanguageEnum;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserInfoSimpleDTO {
    private String name; // 유저 이름
    private String profileImageUrl; // 유저 프로필 사진
}
