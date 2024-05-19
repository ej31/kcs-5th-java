package com.startupcode.thread.lv1.case1;

public class Case1ThreadWithAnonymous {
    public static void main(String[] args) {
        // 첫 번째 Thread 생성
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 1: " + i);
                    try {
                        Thread.sleep(1000); // 1초 기다려
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // 두 번째 Thread 생성
        Thread thread2 = new Thread(() -> {   // 7번 라인 `new Runnable()` 로 표현한 것을 람다식으로 표현했다. 계산 결과는 동일하다.
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(1000); // 1초 기다려
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread 시작
        thread1.start();
        thread2.start();
    }
}