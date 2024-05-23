package com.startupcode.reflect;

public class MainGetClassInfo {
    public static void main(String[] args) {
        try {
            // 클래스 객체를 가져오는 방법 1: Class.forName()
            Class<?> clazz = Class.forName("com.startupcode.reflect.MyClass");

            // 클래스 객체를 가져오는 방법 2: 클래스명.class
            Class<?> clazz2 = MyClass.class;

            // 클래스 객체를 가져오는 방법 3: 객체의 getClass() 메서드 사용
            MyClass myClassInstance = new MyClass();
            Class<?> clazz3 = myClassInstance.getClass();

            System.out.println("Class name: " + clazz.getName());
            System.out.println("Class2 name: " + clazz2.getName());
            System.out.println("Class3 name: " + clazz3.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}