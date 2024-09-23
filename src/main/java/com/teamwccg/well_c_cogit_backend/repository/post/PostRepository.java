package com.teamwccg.well_c_cogit_backend.repository.post;

import com.teamwccg.well_c_cogit_backend.entity.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    // 추가 쿼리 메소드 정의 가능
}
