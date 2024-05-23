package com.startupcode.thread.lv1.case2;

public class SomeRunnableClass2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(1000); // 1초 기다려
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
