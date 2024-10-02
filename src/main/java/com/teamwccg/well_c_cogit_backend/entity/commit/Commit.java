package com.teamwccg.well_c_cogit_backend.entity.commit;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// 커밋
@Entity
@Table(name = "commit", indexes = {
        @Index(name = "idx_user_id", columnList = "user_id"), // userId 필드에 대한 인덱스 유지
        @Index(name = "idx_user_created", columnList = "user_id, created_at") // userId와 created_at 필드에 대한 복합 인덱스 추가
})
@Getter
@Setter
public class Commit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false) // 커밋 id
    private int id;

    @Column(name = "user_id", nullable = false) // 회원 id
    private int userId;

    @Column(name = "repository_id", nullable = false) // 리포지토리 id
    private int repositoryId;

    @Column(name = "message", nullable = true, length = 200) // 커밋 메세지
    private String message;

    @Column(name = "hash", nullable = false, length = 40) // 커밋 SHA-1 해시값
    private String hash;

    @Column(name = "change_line", nullable = false) // 변경 라인
    private int changeLine;

    @Column(name = "add_line", nullable = false) // 추가 라인
    private int addLine;

    @Column(name = "delete_line", nullable = false) // 삭제 라인
    private int deleteLine;

    @Column(name = "change_file", nullable = false) // 변경 파일
    private int changeFile;

    @Column(name = "add_file", nullable = false) // 추가 파일
    private int addFile;

    @Column(name = "delete_file", nullable = false) // 삭제 파일
    private int deleteFile;

    @Column(name = "created_at", nullable = false) // 등록일
    private LocalDateTime createdAt;

    @Column(name = "is_active", nullable = false) // 활성화 여부
    private Boolean isActive;
}
