package com.startupcode.annotation;

import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) {
        try {
            SampleService sampleService = new SampleService();
            Method[] methods = SampleService.class.getDeclaredMethods();

            for (Method method : methods) {
                if (method.isAnnotationPresent(MeasureTime.class)) {
                    long startTime = System.currentTimeMillis();
                    method.invoke(sampleService);
                    long endTime = System.currentTimeMillis();
                    System.out.println("메서드 " + method.getName() + " 실행 시간: " + (endTime - startTime) + " ms");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
