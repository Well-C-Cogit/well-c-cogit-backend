package com.teamwccg.well_c_cogit_backend.dto.ResponseDTO.user;

import com.teamwccg.well_c_cogit_backend.enums.ProgrammingLanguageEnum;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserInfoDetailDTO {
    private String name; // 유저 이름
    private String profileImageUrl; // 유저 프로필 사진
    private String githubId; // 유저 깃허브 id
    private int groupCount; // 가입 모임 수
    private int weeklyCommitCount; // 금주 커밋 수
    private int totalCommitCount; // 총 커밋 수
    private String introduce; // 자기소개
    private ProgrammingLanguageEnum.ProgrammingLanguage mainLanguage; // 주 사용 언어
    private LocalDateTime createdAt; // 가입일
}
