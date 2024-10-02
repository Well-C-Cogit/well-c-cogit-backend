package com.teamwccg.well_c_cogit_backend.controller.user;

import com.teamwccg.well_c_cogit_backend.dto.ResponseDTO.user.UserInfoDetailDTO;
import com.teamwccg.well_c_cogit_backend.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/info-detail")
    public ResponseEntity<UserInfoDetailDTO> getUserInfoDetail(@RequestParam int userId){
        UserInfoDetailDTO userInfoDetailDTO = userService.getUserInfoDetail(userId);
        return ResponseEntity.ok()
                .body(userInfoDetailDTO);
    }

}