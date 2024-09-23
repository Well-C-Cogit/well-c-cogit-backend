package com.teamwccg.well_c_cogit_backend.controller;

import com.teamwccg.well_c_cogit_backend.service.OAuth2TokenService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private final OAuth2TokenService oAuth2TokenService;

    public UserController(OAuth2TokenService oAuth2TokenService) {
        this.oAuth2TokenService = oAuth2TokenService;
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/home")
    public String homePage(Model model, @AuthenticationPrincipal OAuth2User principal, Authentication authentication) {
        if (principal != null) {
            model.addAttribute("username", principal.getAttribute("login"));
            // 로그인 성공 시 액세스 토큰 로그 출력
            oAuth2TokenService.logAccessToken(authentication);
        } else {
            model.addAttribute("message", "현재 로그아웃 상태입니다.");
        }
        return "home";
    }

    @GetMapping("/mypage")
    public String myPage(Model model, @AuthenticationPrincipal OAuth2User principal) {
        if (principal != null) {
            model.addAttribute("userInfo", principal.getAttributes());
        }
        return "mypage";
    }
}
