package com.teamwccg.well_c_cogit_backend.dto.ResponseDTO.repository;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class RepositoryInfoDTO {
    private String name; // 리포지토리 이름
    private String owner; // 리포지토리 소유자 이름(조직 or 사용자)
    private LocalDateTime createdAt; // 웰시코깃 리포지토리 등록일
}
