package com.teamwccg.well_c_cogit_backend.entity.commit;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// Commit Entity
@Entity
@Table(name = "commit")
@Getter
@Setter
public class Commit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // 커밋 ID
    private Integer id;

    @Column(name = "user_id") // 커밋한 사용자 ID
    private Integer userId;

    @Column(name = "repository_id") // 커밋이 속한 저장소 ID
    private Integer repositoryId;

    @Column(name = "message") // 커밋 메시지
    private String message;

    @Column(name = "hash") // 커밋 SHA-1 해시값
    private String hash;

    @Column(name = "change_line") // 변경된 라인 수
    private Integer changeLine;

    @Column(name = "add_line") // 추가된 라인 수
    private Integer addLine;

    @Column(name = "delete_line") // 삭제된 라인 수
    private Integer deleteLine;

    @Column(name = "change_file") // 변경된 파일 수
    private Integer changeFile;

    @Column(name = "add_file") // 추가된 파일 수
    private Integer addFile;

    @Column(name = "delete_file") // 삭제된 파일 수
    private Integer deleteFile;

    @Column(name = "created_at", nullable = false) // 생성일
    private LocalDateTime createdAt;

    @Column(name = "is_active", nullable = false) // 활성화 상태
    private Boolean isActive;
}
