package com.startupcode.thread.lv3.without;

import java.util.Queue;

class Customer {
    private static int orderCounter = 1;
    private final Queue<Order> orderQueue;

    public Customer(Queue<Order> orderQueue) {
        this.orderQueue = orderQueue;
    }

    public void placeOrder() {
        orderQueue.offer(new Order(orderCounter++));
    }
}

