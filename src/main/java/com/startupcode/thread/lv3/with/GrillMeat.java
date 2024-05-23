package com.startupcode.thread.lv3.with;

// 고기 굽기 작업을 담당하는 스레드
class GrillMeat extends Thread {
    public void run() {
        System.out.println("고기를 굽고 있어요...");
        try {
            Thread.sleep(3000); // 고기 굽는데 3초 걸린다고 가정
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("고기를 다 구웠어요!");
    }
}
