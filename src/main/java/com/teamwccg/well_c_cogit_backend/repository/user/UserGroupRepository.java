package com.teamwccg.well_c_cogit_backend.repository.user;

import com.teamwccg.well_c_cogit_backend.entity.group.WccgGroup;
import com.teamwccg.well_c_cogit_backend.entity.user.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup, Integer> {

    int countByUserId(int userId);
}
