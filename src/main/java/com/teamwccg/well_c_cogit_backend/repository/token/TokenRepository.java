package com.teamwccg.well_c_cogit_backend.repository.token;

import com.teamwccg.well_c_cogit_backend.entity.token.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<Token, Integer> {
    // 추가 쿼리 메소드 정의 가능
}
