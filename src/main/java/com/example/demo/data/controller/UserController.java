package com.example.demo.data.controller;

import com.example.demo.data.dto.UserStatsDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.dto.UserPrintDto;
import com.example.demo.data.entity.UserEntity;
import com.example.demo.data.service.UserService;
import com.example.demo.security.jwt.JwtProvider;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {
    private final UserService userService;
    private final JwtProvider jwtProvider;
    public UserEntity getUser(@RequestParam("user_id") Long user_id) {
        System.out.println("i am in here");
        return userService.getUser(user_id);
    }

    @GetMapping("/user/data")
    public ResponseEntity getUserData(HttpServletRequest request) {
        return new ResponseEntity("ok", HttpStatus.OK);
    }

    @GetMapping("/user/{jwt}")
    public UserPrintDto getUserByJWT(@PathVariable("jwt") String jwt) {
        Long userId = Long.parseLong(jwtProvider.getClaimsFromToken(jwt).get("user_id"));
        return userService.findUserPrintById(userId);
    }


    // userId를 통해 유저 정보 조회
    @GetMapping("/userinfor/{userId}")
    public ResponseEntity<UserStatsDto> getUserStats(@PathVariable Long userId) {
        UserEntity user = userService.getUser(userId);

        if (user == null || user.getUserId() == null) {
            return ResponseEntity.notFound().build();
        }

        UserStatsDto userStats = UserStatsDto.builder()
                .nickname(user.getNickname())
                .tot2p(user.getTot2p())
                .win2p(user.getWin2p())
                .tot4p(user.getTot4p())
                .win4p(user.getWin4p())
                .winRate2p(user.getWinRate2p())
                .winRate4p(user.getWinRate4p())
                .build();

        return ResponseEntity.ok(userStats);
    }

}
