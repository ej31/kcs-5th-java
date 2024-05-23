package com.startupcode.thread.semaphore;


import java.sql.Array;

public class MainSemaphore {
    public static void main(String[] args) throws InterruptedException {
        runThreads(new SharedResourceWithCountingSemaphore(1000));
//        runThreads(new SharedResourceWithBinarySemaphore());
//        runThreads(new SharedResourceWithoutSemaphore());
    }

    private static void runThreads(SharedResource sharedResource) throws InterruptedException {
        int MAX_THREADS = 10000;
        System.out.println("[실행]" + sharedResource.getClass().getSimpleName());
        Thread[] threads = new Thread[MAX_THREADS];
        for (int i = 0; i < MAX_THREADS; i++) {
            threads[i] = new Thread(new Worker(sharedResource));
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println("[완료]" + sharedResource.getClass().getSimpleName());
        System.out.println();
    }
}