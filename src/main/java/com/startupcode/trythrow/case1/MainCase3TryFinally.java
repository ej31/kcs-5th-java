package com.startupcode.trythrow.case1;

public class MainCase3TryFinally {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        try {
            System.out.println("🐈 🐈‍⬛ 꽁꽁 얼어붙은 한강위로 고양이가 걸어다닙니다. 🐈 🐈‍⬛");
            // throw new Exception("이런 얼음이 깨져버렸군요..");
            System.out.println("고양이 한강 횡단 완료~ 🤗🏋️‍♂️"); // 이 코드는 9번 라인의 코드의 주석과 스위칭해서 써야 합니다.
        } catch (Exception e) {
            System.out.println("고양이가.. 고양이가.. 🫠 따아흐으으으으흑...");
        } finally {
            // try 블럭에서 에러가 발생했는지 여부 상관 없이 finally 블럭은 언제나 호출합니다
            System.out.println("꽁꽁 얼어붙은 한강은 계속 얼어있습니다. 🥶");
        }
    }
}
