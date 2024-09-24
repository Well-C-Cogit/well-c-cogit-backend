package com.teamwccg.well_c_cogit_backend.repository.user;

import com.teamwccg.well_c_cogit_backend.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // 추가 쿼리 메소드 정의 가능
}
