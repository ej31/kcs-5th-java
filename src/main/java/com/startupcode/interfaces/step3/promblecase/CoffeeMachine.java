package com.startupcode.interfaces.step3.promblecase;

/**
 *  두 클래스 CoffeeMachine과 BasicCoffeeMachine이 서로 강하게 결합된 예입니다.
 *  CoffeeMachine 클래스는 BasicCoffeeMachine 클래스의 구체적인 구현에 의존하고 있습니다.
 *  이 경우, CoffeeMachine 클래스는 항상 BasicCoffeeMachine 클래스와 함께 동작해야 합니다.
 *  이는 유연성을 떨어뜨리고, 나중에 다른 종류의 커피 머신을 사용하고자 할 때 문제가 됩니다.
 */
// CoffeeMachine 클래스
public class CoffeeMachine {
    private BasicCoffeeMachine coffeeMachine;

    public CoffeeMachine() {
        this.coffeeMachine = new BasicCoffeeMachine();
    }

    public void makeCoffee() {
        coffeeMachine.brew();
    }
}
