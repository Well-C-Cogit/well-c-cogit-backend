package com.teamwccg.well_c_cogit_backend.utils;

import org.springframework.stereotype.Component;
import java.time.DayOfWeek;
import java.time.LocalDateTime;

// 날짜 관련 유틸리티
@Component
public class DateUtils {

    // 금주의 시작일(월요일 00:00:00) 반환
    public LocalDateTime getStartOfWeek() {
        return LocalDateTime.now()
                .with(DayOfWeek.MONDAY) // 현재 날짜에서 금주의 월요일로 설정
                .withHour(0) // 시: 0
                .withMinute(0) // 분: 0
                .withSecond(0) // 초: 0
                .withNano(0); // 나노초: 0
    }

    // 금주의 종료일(다음 주 월요일 00:00:00) 반환
    public LocalDateTime getEndOfWeek() {
        return getStartOfWeek().plusDays(7); // 시작일에 7일 추가
    }
}
