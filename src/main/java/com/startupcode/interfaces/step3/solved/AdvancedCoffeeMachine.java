package com.startupcode.interfaces.step3.solved;

/**
 * 아래와 같이 새로운 커피 머신 클래스를 추가해도
 * 기존 CoffeeMachine 클래스의 코드를 변경할 필요가 없습니다.
 */
// AdvancedCoffeeMachine 클래스
public class AdvancedCoffeeMachine implements CoffeeMaker {
    public void brew() {
        System.out.println("고급 커피를 내립니다.");
    }
}
