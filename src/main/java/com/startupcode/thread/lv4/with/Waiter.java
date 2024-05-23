package com.startupcode.thread.lv4.with;

import java.util.concurrent.BlockingQueue;

import static com.startupcode.thread.lv4.OrderManager.WAITER_PROCESS_TIME;

class Waiter extends Thread {
    private final String name;
    private final BlockingQueue<Order> orderQueue;

    public Waiter(String name, BlockingQueue<Order> orderQueue) {
        this.name = name;
        this.orderQueue = orderQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Order order = orderQueue.take();
                processOrder(order);
                if (orderQueue.isEmpty()) {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void processOrder(Order order) {
        try {
            Thread.sleep(WAITER_PROCESS_TIME);
            System.out.println(name + " 의 주문을 처리중입니다. 주문번호 : " + order.getOrderNumber());
        } catch (InterruptedException e) {
            System.out.println(name + " 의 주문이 인터럽트 되었습니다. 주문번호 : " + order.getOrderNumber());
            throw new RuntimeException(e);

        }
    }
}

