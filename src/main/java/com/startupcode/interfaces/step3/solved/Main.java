package com.startupcode.interfaces.step3.solved;

/**
 *  CoffeMaker 인터페이스를 통해  다양한 종류의 CoffeeMachine 클래스를 사용할 수 있게 됐습니다.
 * 객체를 생성할 때 필요한 커피 머신을 주입하면 됩니다.
 */
public class Main {
    public static void main(String[] args) {
        CoffeeMaker basicMachine = new BasicCoffeeMachine();
        CoffeeMaker advancedMachine = new AdvancedCoffeeMachine();

        CoffeeMachine coffeeMachine1 = new CoffeeMachine(basicMachine);
        coffeeMachine1.makeCoffee(); // 커피를 내립니다.

        CoffeeMachine coffeeMachine2 = new CoffeeMachine(advancedMachine);
        coffeeMachine2.makeCoffee(); // 고급 커피를 내립니다.
    }
}
