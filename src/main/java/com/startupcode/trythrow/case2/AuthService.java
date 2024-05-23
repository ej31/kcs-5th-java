package com.startupcode.trythrow.case2;

import com.startupcode.exceptions.InvalidPasswordException;
import com.startupcode.exceptions.UserNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class AuthService {
    // 간단한 사용자 데이터베이스 모사
    private final static Map<String, String> userDatabase = new HashMap<>();

    static {
        userDatabase.put("김철수", "password123");
        userDatabase.put("이영희", "password456");
    }

    public void authenticate(String username, String password) throws UserNotFoundException, InvalidPasswordException {
        // 사용자 이름으로 사용자 찾기
        if (!userDatabase.containsKey(username)) {
            throw new UserNotFoundException("사용자를 찾을 수 없습니다: " + username);
        }

        // 비밀번호 확인
        String correctPassword = userDatabase.get(username);
        if (!correctPassword.equals(password)) {
            throw new InvalidPasswordException("비밀번호가 올바르지 않습니다.");
        }

        // 인증 성공
        System.out.println(username + "님, 로그인에 성공하셨습니다.");
    }
}
