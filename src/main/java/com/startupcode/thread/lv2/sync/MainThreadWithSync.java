package com.startupcode.thread.lv2.sync;

import static com.startupcode.thread.lv2.StaticClass.LOOP_COUNT;
import static com.startupcode.thread.lv2.StaticClass.SOME_STATIC_VARIABLE;

/**
 * 전역 변수와 공유 객체는 스레드 간에 공유되므로, 스레드 간의 동기화 문제가 발생할 수 있습니다.
 * 이 예제는 동기화 문제를 해결하지 않았으므로, 전역 변수와 공유 객체 값이 예상과 다를 수 있습니다.
 * 동기화 문제를 해결하려면, synchronized 키워드를 사용하거나, Lock 객체를 사용하면 됩니다.
 * synchronized 키워드는 메소드 또는 블록에 사용할 수 있으며, Lock 객체는 Lock 인터페이스를 구현한 객체입니다.
 * synchronized 키워드는 내부적으로 Lock 객체를 사용하며, Lock 객체는 synchronized 키워드보다 더 세밀한 동기화를 제공합니다.
 */
public class MainThreadWithSync {

    public static void main(String[] args) {
        ThreadFirstWithSync t1 = new ThreadFirstWithSync();
        ThreadSecondWithSync t2 = new ThreadSecondWithSync();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("최종 전역변수 값: " + SOME_STATIC_VARIABLE);
        System.out.println("실제 연산 횟수: " + LOOP_COUNT * 2); // LOOP_COUNT * thread count

    }
}