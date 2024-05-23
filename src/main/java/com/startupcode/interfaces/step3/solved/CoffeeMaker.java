package com.startupcode.interfaces.step3.solved;


/**
 * CoffeeMachine 클래스와 BasicCoffeeMachine 클래스 사이에
 * 인터페이스 CoffeeMaker를 정의하여 두 클래스 간의 의존성을 줄입니다.
 */
// CoffeeMaker 인터페이스
public interface CoffeeMaker {
    void brew();

    static void hey() {
        System.out.println("!");
    }
}
