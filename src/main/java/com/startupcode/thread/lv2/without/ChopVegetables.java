package com.startupcode.thread.lv2.without;

// 야채 자르기 작업을 담당하는 스레드
class ChopVegetables {
    public void proc() {
        System.out.println("야채를 자르고 있어요...");
        try {
            Thread.sleep(2000); // 야채 자르는데 2초 걸린다고 가정
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("야채를 다 잘랐어요!");
    }
}
