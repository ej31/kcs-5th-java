package com.startupcode.lambda.stream;

import com.startupcode.exceptions.DataAccessException;
import com.startupcode.exceptions.InvalidUserCredentialsException;
import com.startupcode.exceptions.UserNotFoundException;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserService {
    private final static Map<String, String> userDatabase = new HashMap<>();

    static {
        userDatabase.put("kim", "password123");
        userDatabase.put("lee", "password456");
    }

    public void authenticate(String username, String password) throws UserNotFoundException, InvalidUserCredentialsException {
        /*
        Optional 클래스
            Optional 클래스는 null 값을 안전하게 처리하기 위한 컨테이너입니다.
            Optional 객체는 값이 있을 수도 있고 없을 수도 있습니다.
            이를 통해 NullPointerException을 방지할 수 있습니다.
            이 코드에서는 userDatabase.get(username)의 결과를 Optional로 감싸고 있습니다.
            만약 userDatabase.get(username)의 결과가 null이라면 Optional.empty 객체가 반환됩니다.
         */
        Optional<String> storedPasswordOpt = Optional.ofNullable(userDatabase.get(username));

        // 사용자 존재 여부 확인
        if (storedPasswordOpt.isEmpty()) {
            throw new UserNotFoundException("없는 유저 : " + username);
        }

        // 비밀번호 확인
        /*
            - filter 메소드
                Optional 객체에 저장된 값이 특정 조건을 만족하는지 검사합니다.
                만약 조건을 만족한다면 그 Optional 객체를 그대로 반환하고,
                만족하지 않는다면 Optional.empty 객체를 반환합니다.
                이 코드에서는 storedPassword가 입력받은 password와 같은지 검사합니다.

            - orElseThrow 메소드
                Optional 객체가 비어있는 경우, 즉 null 값을 갖는 경우에 예외를 발생시킵니다.
                이 코드에서는 Optional 객체가 비어있는 경우 InvalidUserCredentialsException을 발생시키고 있습니다.
                이는 입력받은 비밀번호와 저장된 비밀번호가 일치하지 않는 경우에 해당합니다
        */
        storedPasswordOpt
                .filter(storedPassword -> storedPassword.equals(password))
                .orElseThrow(() -> new InvalidUserCredentialsException("유저 비밀번호 다름. 유저이름 : " + username));
        System.out.println(username + ": 인증 성공");
    }

    public void getUserById(String userId) throws UserNotFoundException, DataAccessException {

        // 데이터베이스 액세스 로직
        boolean dbConnectionFailed = false; // 실제 구현에서는 DB 연결 상태 확인

        if (dbConnectionFailed) {
            throw new DataAccessException("DB 연결 실패");
        }

        Optional
                .ofNullable(userDatabase.get(userId))
                .orElseThrow(() -> new UserNotFoundException("유저를 찾을 수 없음. 유저아이디: " + userId));

        System.out.println("유저 아이디: " + userId);
    }
}
