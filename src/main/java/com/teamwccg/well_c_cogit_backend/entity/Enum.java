package com.teamwccg.well_c_cogit_backend.entity;

public class Enum {
    public enum groupType {
        BASIC, // 기본
        STUDY // 스터디
    }

    public enum medalTier {
        BRONZE, // 브론즈
        SILVER, // 실버
        GOLD, // 골드
        PLATINUM, // 플래티넘
        EMERALD, // 에메랄드
        DIAMOND // 다이아몬드
    }

    public enum targetTypeAll {
        USER, // 회원
        GROUP, // 모임
        ALL // 전체
    }
    public enum targetType {
        USER, // 회원
        GROUP // 모임
    }

    public enum inviteState {
        PENDING, // 초대 대기
        ACCEPTED, // 초대 승인
        REJECTED; // 초대 거절
    }

    public enum joinState {
        PENDING, // 가입 대기
        ACCEPTED, // 가입 승인
        REJECTED; // 가입 거절
    }
}
