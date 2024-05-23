package com.startupcode.thread.lv1.case2;

public class Case2ThreadWithClass {
    public static void main(String[] args) {
        // 첫 번째 Thread 생성
        Thread thread1 = new Thread(new SomeRunnableClass1());

        // 두 번째 Thread 생성
        Thread thread2 = new Thread(new SomeRunnableClass2());

        // Thread 시작
        thread1.start();
        thread2.start();
    }
}