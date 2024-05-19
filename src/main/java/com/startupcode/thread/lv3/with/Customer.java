package com.startupcode.thread.lv3.with;

import java.util.concurrent.BlockingQueue;

class Customer extends Thread {
    private static int orderCounter = 1;
    private BlockingQueue<Order> orderQueue;

    public Customer(BlockingQueue<Order> orderQueue) {
        this.orderQueue = orderQueue;
    }

    @Override
    public void run() {
        try {
            orderQueue.put(new Order(orderCounter++));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}