package com.startupcode.thread.lv2;

public class StaticClass {
    // 전역 변수 (Data Segment에 저장)
    public static int SOME_STATIC_VARIABLE = 0;
    public static int LOOP_COUNT = 100;
    public static int SLEEP_TIME = 100;
    public static final Object lock = new Object();
}
