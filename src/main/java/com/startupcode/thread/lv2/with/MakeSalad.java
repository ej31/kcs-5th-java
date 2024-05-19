package com.startupcode.thread.lv2.with;

// 샐러드 만들기 작업을 담당하는 스레드
class MakeSalad extends Thread {
    public void run() {
        System.out.println("샐러드를 만들고 있어요...");
        try {
            Thread.sleep(1000); // 샐러드 만드는데 1초 걸린다고 가정
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("샐러드를 다 만들었어요!");
    }
}