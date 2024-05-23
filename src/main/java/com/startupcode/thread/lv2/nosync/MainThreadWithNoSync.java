package com.startupcode.thread.lv2.nosync;

import com.startupcode.thread.lv2.StaticClass;

import static com.startupcode.thread.lv2.StaticClass.LOOP_COUNT;

/**
 * 아래 클래스는 전역 변수와 공유 객체를 사용하는 예제입니다.
 * 전역 변수는 Data Segment에 저장되며, 공유 객체는 Heap에 저장됩니다.
 * 두 스레드가 전역 변수와 공유 객체를 공유하며, 각 스레드는 1초마다 전역 변수와 공유 객체 값을 증가시킵니다.
 * 두 스레드가 종료된 후, 메인 스레드에서 최종 전역 변수와 공유 객체 값을 출력합니다.
 */
public class MainThreadWithNoSync {

    public static void main(String[] args) {
        // 스레드 인스턴스 생성
        Thread t1 = new Thread(new ThreadFirst());
        Thread t2 = new Thread(new ThreadSecond());

        // 스레드 시작
        t1.start();
        t2.start();

        // 메인 스레드가 두 스레드의 종료를 기다림
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 최종 전역변수 및 공유객체 값 출력
        System.out.println("최종 전역변수 값: " + StaticClass.SOME_STATIC_VARIABLE);
        System.out.println("실제 연산 횟수: " + LOOP_COUNT * 2); // LOOP_COUNT * thread count
    }
}