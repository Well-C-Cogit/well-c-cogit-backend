package com.teamwccg.well_c_cogit_backend.repository.medal;

import com.teamwccg.well_c_cogit_backend.entity.medal.Medal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedalRepository extends JpaRepository<Medal, Integer> {
    // 추가 쿼리 메소드 정의 가능
}
