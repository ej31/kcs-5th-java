package com.startupcode.trythrow.case1;

public class MainCase1Throw {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");

        throw new Exception("으악 에러다! 삐용삐용! 🚨"); // 이 시점에 메서드 호출 종료!

//        System.out.println("앞에서 예외가 발생했으므로 이 문자열은 출력 될 수 없습니다!");
    }
}
