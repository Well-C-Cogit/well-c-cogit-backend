package com.teamwccg.well_c_cogit_backend.enums;

public class GroupEnum {
    public enum groupType { // 그룹 타입
        BASIC, // 기본
        STUDY // 스터디
    }
    public enum groupInviteState { // 그룹의 멤버 초대 상태
        PENDING, // 초대 대기
        ACCEPTED, // 초대 승인
        REJECTED // 초대 거절
    }
    public enum groupJoinState { // 멤버의 그룹 가입 요청 상태
        PENDING, // 가입 대기
        ACCEPTED, // 가입 승인
        REJECTED // 가입 거절
    }
}
