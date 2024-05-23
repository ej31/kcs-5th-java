package com.startupcode.thread.lv3.without;

// 샐러드 만들기 작업을 담당하는 스레드
class MakeSalad {
    public void proc() {
        System.out.println("샐러드를 만들고 있어요...");
        try {
            Thread.sleep(1000); // 샐러드 만드는데 1초 걸린다고 가정
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("샐러드를 다 만들었어요!");
    }
}