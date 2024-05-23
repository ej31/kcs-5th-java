package com.startupcode.thread.lv4.without;

import java.util.LinkedList;
import java.util.Queue;

import static com.startupcode.thread.lv4.OrderManager.MAX_ORDERS;

class RestaurantWithoutThread {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // 주문 큐 생성
        Queue<Order> orderQueue = new LinkedList<>();

        // 고객 생성 및 주문 생성
        for (int i = 0; i < MAX_ORDERS; i++) {
            new Customer(orderQueue).placeOrder();
        }

        // 웨이터 생성 및 일 시작
        Waiter waiter1 = new Waiter("데릭", orderQueue);
        Waiter waiter2 = new Waiter("애스핀", orderQueue);
        Waiter waiter3 = new Waiter("세니", orderQueue);
        waiter1.processOrders();
        waiter2.processOrders();
        waiter3.processOrders();
        long endTime = System.currentTimeMillis();
        System.out.println("Processing 1000 orders took " + (endTime - startTime) + " milliseconds.");
    }
}
