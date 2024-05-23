package com.startupcode.trythrow.case2;

import com.startupcode.exceptions.InvalidPasswordException;
import com.startupcode.exceptions.UserNotFoundException;

public class MainCase1ExpandCatch {
    public static void main(String[] args) {
        AuthService authService = new AuthService();

        try {
            // 올바른 사용자명과 비밀번호
            authService.authenticate("김철수", "password123");

            // 잘못된 사용자명
            authService.authenticate("박철민", "password123");

            // 올바른 사용자명과 잘못된 비밀번호
            authService.authenticate("이영희", "wrongpassword");
        } catch (UserNotFoundException e) {
            System.out.println("오류: " + e.getMessage());
        } catch (InvalidPasswordException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }
}
