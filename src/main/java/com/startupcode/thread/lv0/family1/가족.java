package com.startupcode.thread.lv0.family1;

/**
 * Thread Class 는 Runnable 인터페이스를 구현한 것이다.
 * 따라서 Runnable의 run() 과 Thread의 run() 은 같다.
 */
public class 가족 {
    // 공유 자원 (냉장고)
    private static class 냉장고 {
        // synchronized 키워드를 뺀 경우와 넣은 경우 둘 다 실행해보시라
        public void 사용(String 이름) {
            System.out.println(이름 + "이(가) 냉장고를 사용하고 있습니다.");
            try {
                Thread.sleep(1000); // 1초간 냉장고 사용
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(이름 + "이(가) 냉장고 사용을 마쳤습니다.");
        }
    }

    private static 냉장고 공용냉장고 = new 냉장고();

    // 어머니 스레드
    public static class 어머니 extends Thread {
        public void run() {
            for (int i = 0; i < 3; i++) {
                공용냉장고.사용("어머니");
            }
        }
    }

    // 아버지 스레드
    public static class 아버지 extends Thread {
        public void run() {
            for (int i = 0; i < 3; i++) {
                공용냉장고.사용("아버지");
            }
        }
    }

    // 아이 스레드
    public static class 아이 extends Thread {
        public 아이(Runnable target, String name) {
            super(target, name);
        }

        public void run() {
            for (int i = 0; i < 3; i++) {
                공용냉장고.사용("아이");
            }
        }
    }

    public static void main(String[] args) {
        // 각 가족 구성원 스레드 생성
        어머니 어머니스레드 = new 어머니();
        아버지 아버지스레드 = new 아버지();
        아이 아이스레드 = new 아이(() -> {
            for (int i = 0; i < 3; i++) {
                공용냉장고.사용("아이");
            }
        }, "아이스레드");

        // 스레드 시작
        어머니스레드.start();
        아버지스레드.start();
        아이스레드.start();

        // 모든 스레드가 종료될 때까지 대기
        try {
            어머니스레드.join();
            아버지스레드.join();
            아이스레드.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("모든 가족 구성원이 냉장고 사용을 마쳤습니다.");
    }
}