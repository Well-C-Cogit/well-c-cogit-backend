package com.teamwccg.well_c_cogit_backend.service.user;

import com.teamwccg.well_c_cogit_backend.dto.ResponseDTO.user.UserInfoDetailDTO;
import com.teamwccg.well_c_cogit_backend.entity.user.User;
import com.teamwccg.well_c_cogit_backend.utils.DateUtils;
import com.teamwccg.well_c_cogit_backend.repository.commit.CommitRepository;
import com.teamwccg.well_c_cogit_backend.repository.user.UserGroupRepository;
import com.teamwccg.well_c_cogit_backend.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final CommitRepository commitRepository;
    private final UserGroupRepository userGroupRepository;
    private final DateUtils dateUtils;

    public UserInfoDetailDTO getUserInfoDetail(int userId) {
        // 사용자 정보를 Optional로 가져오기
        Optional<User> userOptional = userRepository.findById(userId);

        // 사용자 정보가 존재하지 않는 경우 예외 발생 (RuntimeException 사용)
        User user = userOptional.orElseThrow(() -> new RuntimeException("User not found"));

        // 사용자 정보를 DTO로 변환
        UserInfoDetailDTO userInfoDetail = new UserInfoDetailDTO();
        userInfoDetail.setName(user.getName()); // 실제 사용자 이름 설정
        userInfoDetail.setProfileImageUrl(user.getProfileImageUrl());
        userInfoDetail.setGithubId(user.getGithubId());

        // 커밋 수를 직접 카운트
        int totalCommitCount = commitRepository.countByUserId(userId);
        userInfoDetail.setTotalCommitCount(totalCommitCount);

        // 유저 그룹 수를 직접 카운트
        int groupCount = userGroupRepository.countByUserId(userId);
        userInfoDetail.setGroupCount(groupCount);

        // 금주 커밋 수 카운트
        LocalDateTime startOfWeek = dateUtils.getStartOfWeek(); // startOfWeek 가져오기
        LocalDateTime endOfWeek = dateUtils.getEndOfWeek(); // endOfWeek 가져오기
        int weeklyCommitCount = commitRepository.countByUserIdAndCreatedAtBetween(userId, startOfWeek, endOfWeek);
        userInfoDetail.setWeeklyCommitCount(weeklyCommitCount);

        userInfoDetail.setIntroduce(user.getIntroduce());
        userInfoDetail.setMainLanguage(user.getMainLanguage());
        userInfoDetail.setCreatedAt(user.getCreatedAt());

        return userInfoDetail;
    }

}
