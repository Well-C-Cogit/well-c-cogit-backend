package com.teamwccg.well_c_cogit_backend.dto.ResponseDTO.commit;

import com.teamwccg.well_c_cogit_backend.dto.ResponseDTO.user.UserInfoSimpleDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CommitInfoDetailDTO {
    private UserInfoSimpleDTO userInfo; // 커밋 유저 정보
    private String message; // 커밋 메세지
    private LocalDateTime createdAt; // 등록일
    private String repositoryName; // 커밋한 리포지토리 이름
    private String hash; // 커밋 SHA-1 해시값
    private int changeLine; // 변경 라인 수
    private int addLine; // 추가 라인 수
    private int deleteLine; // 삭제 라인 수
    private int changeFile; // 변경 파일 수
    private int addFile; // 추가 파일 수
    private int deleteFile; // 삭제 파일 수
}
