package com.teamwccg.well_c_cogit_backend.repository.group;

import com.teamwccg.well_c_cogit_backend.entity.group.WccgGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WccgGroupRepository extends JpaRepository<WccgGroup, Integer> {
    // 추가 쿼리 메소드 정의 가능
}
