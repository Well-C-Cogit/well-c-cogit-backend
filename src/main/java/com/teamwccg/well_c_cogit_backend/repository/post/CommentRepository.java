package com.teamwccg.well_c_cogit_backend.repository.post;

import com.teamwccg.well_c_cogit_backend.entity.post.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    // 추가 쿼리 메소드 정의 가능
}
