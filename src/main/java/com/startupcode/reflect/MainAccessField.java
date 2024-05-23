package com.startupcode.reflect;

import java.lang.reflect.Field;

public class MainAccessField {
    public static void main(String[] args) {
        try {
            MyClass myClassInstance = new MyClass();

            // 클래스 객체를 가져옴
            Class<?> clazz = myClassInstance.getClass();

            // 필드를 가져옴
            Field field = clazz.getDeclaredField("privateField");

            // 접근 가능하도록 설정
            field.setAccessible(true);

            // 필드 값 설정
            field.set(myClassInstance, "새로운 값");

            // 필드 값 출력
            System.out.println("Updated Field Value: " + field.get(myClassInstance));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
