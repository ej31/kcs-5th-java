package com.startupcode.reflect;

import java.lang.reflect.Method;

public class MainCallPrivateMethod {
    public static void main(String[] args) {
        try {
            MyClass myClassInstance = new MyClass();

            // 클래스 객체를 가져옴
            Class<?> clazz = myClassInstance.getClass();

            // 메서드를 가져옴
            Method method = clazz.getDeclaredMethod("privateMethod");

            // 접근 가능하도록 설정
            method.setAccessible(true);

            // 메서드 호출
            method.invoke(myClassInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
