package com.startupcode.thread.lv0.family2;

public class FamilyTaskExample {
    public static void main(String[] args) {
        // 사용 방법 첫 번째 -- Thread / Runnable 인스턴스 생성 후 Thread 생성 및 실행
        // 각 가족 구성원의 작업을 생성
        Task cleaning = new Task("집 청소");
        Task cooking = new Task("요리");
        Task takingOutTrash = new Task("쓰레기 버리기");
        Task laundry = new Task("세탁");

        // 각 작업을 수행할 사람(스레드)을 생성
        Thread father = new Thread(cleaning);
        Thread mother = new Thread(cooking);
        Thread son = new Thread(takingOutTrash);
        Thread daughter = new Thread(laundry);

        father.start();
        mother.start();
        son.start();
        daughter.start();

        // 사용 방법 두 번째
        Runnable laundryAndDance = () -> {
            new Task("세탁").run();
            new Task("춤추기").run();
        };
        Thread daughter2 = new Thread(laundryAndDance);
        daughter2.start();

        // 사용 방법 세 번째
        Thread daughter3 = new Thread(new Task("세탁", "셋째딸"));
        daughter3.start();
    }
}
