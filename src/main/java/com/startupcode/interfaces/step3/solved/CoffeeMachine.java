package com.startupcode.interfaces.step3.solved;

/**
 * 이제 CoffeeMachine 클래스는 CoffeeMaker 인터페이스를 통해 커피 머신에 의존하게 됩니다.
 */
// CoffeeMachine 클래스
public class CoffeeMachine {
    private final CoffeeMaker coffeeMaker;

    public CoffeeMachine(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public void makeCoffee() {
        coffeeMaker.brew();
    }
}
