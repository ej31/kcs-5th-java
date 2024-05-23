package com.startupcode.annotation;

public class SampleService {

    @MeasureTime
    public void performTask() {
        try {
            Thread.sleep(2000);
            System.out.println("작업이 완료되었습니다.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
