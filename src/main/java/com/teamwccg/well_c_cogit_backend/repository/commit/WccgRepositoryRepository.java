package com.teamwccg.well_c_cogit_backend.repository.commit;

import com.teamwccg.well_c_cogit_backend.entity.commit.WccgRepository; // WccgRepository 엔티티
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WccgRepositoryRepository extends JpaRepository<WccgRepository, Integer> {
    // 추가 쿼리 메소드 정의 가능
}
