package com.startupcode.thread.lv1.case1;

public class MyApplication {
    public static void main(String[] args) {
        SomeThreadClass thread = new SomeThreadClass();
        thread.start();
    }
}
