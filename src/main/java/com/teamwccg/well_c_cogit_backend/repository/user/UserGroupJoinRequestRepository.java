package com.teamwccg.well_c_cogit_backend.repository.user;

import com.teamwccg.well_c_cogit_backend.entity.user.UserGroupJoinRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupJoinRequestRepository extends JpaRepository<UserGroupJoinRequest, Integer> {
    // 추가 쿼리 메소드 정의 가능
}
