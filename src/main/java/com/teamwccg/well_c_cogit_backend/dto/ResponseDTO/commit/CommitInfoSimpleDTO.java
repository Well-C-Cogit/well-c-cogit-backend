package com.teamwccg.well_c_cogit_backend.dto.ResponseDTO.commit;

import com.teamwccg.well_c_cogit_backend.dto.ResponseDTO.user.UserInfoSimpleDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CommitInfoSimpleDTO {
    private UserInfoSimpleDTO userInfo; // 커밋 유저 정보
    private String message; // 커밋 메세지
    private LocalDateTime createdAt; // 등록일
}
