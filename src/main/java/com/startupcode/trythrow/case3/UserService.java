package com.startupcode.trythrow.case3;
import com.startupcode.exceptions.DataAccessException;
import com.startupcode.exceptions.InvalidUserCredentialsException;
import com.startupcode.exceptions.UserNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private final static Map<String, String> userDatabase = new HashMap<>();

    static {
        userDatabase.put("kim", "password123");
        userDatabase.put("lee", "password456");
    }

    public void authenticate(String username, String password) throws UserNotFoundException, InvalidUserCredentialsException {
        if (!userDatabase.containsKey(username)) {
            throw new UserNotFoundException("유저 이름 못 찾음" + username);
        }

        String storedPassword = userDatabase.get(username);
        if (!storedPassword.equals(password)) {
            throw new InvalidUserCredentialsException("유저 비밀번호 틀림" + username);
        }

        System.out.println(username + " : 인증 성공");
    }
    public void getUserById(String userId) throws UserNotFoundException, DataAccessException {
        // 데이터베이스 액세스 로직 (예제에서는 단순히 사용자 존재 여부 확인)
        if (!userDatabase.containsKey(userId)) {
            throw new UserNotFoundException("없는 유저 아이디 : " + userId);
        }

        // 데이터베이스 연결 실패 시 예외 발생 시뮬레이션
        boolean dbConnectionFailed = false; // 실제 구현에서는 DB 연결 상태 확인
        if (dbConnectionFailed) {
            throw new DataAccessException("DB 연결 실패");
        }
        System.out.println("유저 아이디: " + userId);
    }
}
