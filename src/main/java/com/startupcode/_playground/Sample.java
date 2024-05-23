package com.startupcode._playground;

public class Sample {

    public static void main(String[] args) {


        new Thread(() -> {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        });

    }
}
