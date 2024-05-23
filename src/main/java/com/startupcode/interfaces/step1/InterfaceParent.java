package com.startupcode.interfaces.step1;

 interface InterfaceParent {
    int value = 1;
    String someString = "Hey!";

    abstract void m1(); // 인터페이스의 메서드는 기본적으로 abstract 이므로 abtract 키워드를 생략할 수 있다.
    static void m2() {
        System.out.println("!");
    }
}
