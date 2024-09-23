package com.teamwccg.well_c_cogit_backend.repository.user;

import com.teamwccg.well_c_cogit_backend.entity.user.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup, Integer> {
    // 추가 쿼리 메소드 정의 가능
}
