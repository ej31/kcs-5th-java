package com.startupcode.thread.lv4.with;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static com.startupcode.thread.lv4.OrderManager.MAX_ORDERS;

class RestaurantWithThread {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // 주문 큐 생성
        BlockingQueue<Order> orderQueue = new LinkedBlockingQueue<>(MAX_ORDERS);

        // 고객 생성 및 주문 생성
        for (int i = 0; i < MAX_ORDERS; i++) {
            new Customer(orderQueue).start();
        }

        // 웨이터 생성 및 일 시작
        Waiter waiter1 = new Waiter("데릭", orderQueue);
        Waiter waiter2 = new Waiter("애스핀", orderQueue);
        Waiter waiter3 = new Waiter("세니", orderQueue);

        waiter1.start();
        waiter2.start();
        waiter3.start();

        // 모든 웨이터가 일을 끝낼 때까지 기다림
        try {
            waiter1.join();
            waiter2.join();
            waiter3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Processing 1000 orders took " + (endTime - startTime) + " milliseconds.");
    }
}
