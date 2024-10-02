package com.teamwccg.well_c_cogit_backend.repository.commit;

import com.teamwccg.well_c_cogit_backend.entity.commit.Commit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CommitRepository extends JpaRepository<Commit, Integer> {

    // 특정 사용자 ID와 주어진 날짜 범위 내의 커밋 수를 카운트하는 메서드
    int countByUserIdAndCreatedAtBetween(int userId, LocalDateTime startDate, LocalDateTime endDate);

    int countByUserId(int userId);
}
