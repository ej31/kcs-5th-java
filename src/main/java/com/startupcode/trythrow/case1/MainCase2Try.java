package com.startupcode.trythrow.case1;

public class MainCase2Try {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        try {
            throw new Exception("으악 에러다! 삐용삐용! 🚨"); // 이 시점에 메서드 호출 종료!
        } catch (Exception e) {
            System.out.println("에러를 잘 잡았습니다 🤗 이제 코드는 다시 정상 진행합니다.");
        }

        System.out.println("앞에서 예외가 발생했으므로 이 문자열은 출력 될 수 없..을줄 알았는데 잘 됩니다!");

    }
}
