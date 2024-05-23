package com.startupcode.trythrow.case3;

import com.startupcode.exceptions.DataAccessException;
import com.startupcode.exceptions.InvalidUserCredentialsException;
import com.startupcode.exceptions.UserNotFoundException;

public class MainTryThrow {
    public static void main(String[] args) {
        UserService userService = new UserService();

        try {
            userService.authenticate("kim", "password123");
            userService.authenticate("lee", "wrongpassword");
        } catch (UserNotFoundException e) {
            System.out.println("User not found error: " + e.getMessage());
        } catch (InvalidUserCredentialsException e) {
            System.out.println("Invalid credentials error: " + e.getMessage());
        }

        try {
            userService.getUserById("kim");
            userService.getUserById("park");
        } catch (UserNotFoundException e) {
            System.out.println("User not found error: " + e.getMessage());
        } catch (DataAccessException e) {
            System.out.println("Data access error: " + e.getMessage());
        }
    }
}
