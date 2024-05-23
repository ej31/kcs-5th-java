package com.startupcode.thread.lv2.sync;

import static com.startupcode.thread.lv2.StaticClass.*;

public class ThreadSecondWithSync extends Thread {
    public void run() {
        for (int i = 0; i < LOOP_COUNT; i++) {
            synchronized (lock) {
                int temp = SOME_STATIC_VARIABLE;
                try {
                    Thread.sleep(SLEEP_TIME); // 일부러 delay를 주어 race condition을 유발
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                SOME_STATIC_VARIABLE = temp + 1;
            }
            System.out.println("두번째스레드 - 전역변수: " + SOME_STATIC_VARIABLE);
        }
    }
}
