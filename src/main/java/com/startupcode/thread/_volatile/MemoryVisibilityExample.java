package com.startupcode.thread._volatile;

/**
 *   thread 1 은 running 변수가 false 로 바뀔 경우 멈추는 조건이다.
 *   thread 2 는 running 변수를 false 로 바꾸는 아주 간단한 코드다.
 *   하지만 running 변수가 volatile 을 사용하지 않으면 thread 1 은 영원히 끝날 수 없다.
 *   이유는 running 변수는 cpu cache 로 부터 변수를 참조 받기 때문이다.
 *
 *   한 스레드는 하나의 CPU 에 배정된다. 각 CPU 에는 cpu cache 가 존재한다.
 *   두 스레드는 각각의 cpu cache 를 통해 값을 참조하기 때문에 영원히 돌게 되는 문제가 생기는 것이다.
 */
public class MemoryVisibilityExample {
//    volatile boolean running = true;
    boolean running = true;

    public void test() {
        new Thread(() -> {
            int counter = 0;
            while (running) {
                counter++;
            }
            System.out.println("Thread 1 finished. Counted up to " + counter);
        }
        ).start();
        new Thread(() -> {
            try {
                // thread 1 시작 될 때 까지 대기
                Thread.sleep(100);
            } catch (InterruptedException ignored) {
                // catch block
            }
            System.out.println("Thread 2 finishing");
            running = false;
        }
        ).start();
    }

    public static void main(String[] args) {
        new MemoryVisibilityExample().test();
    }
}