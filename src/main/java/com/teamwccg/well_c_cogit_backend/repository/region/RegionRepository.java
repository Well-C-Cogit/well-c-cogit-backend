package com.teamwccg.well_c_cogit_backend.repository.region;

import com.teamwccg.well_c_cogit_backend.entity.region.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {
    // 추가 쿼리 메소드 정의 가능
}
