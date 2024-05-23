package com.startupcode.thread.lv4.without;

import java.util.Queue;

import static com.startupcode.thread.lv4.OrderManager.WAITER_PROCESS_TIME;

class Waiter {
    private final String name;
    private final Queue<Order> orderQueue;

    public Waiter(String name, Queue<Order> orderQueue) {
        this.name = name;
        this.orderQueue = orderQueue;
    }

    public void processOrders() {
        while (!orderQueue.isEmpty()) {
            Order order = orderQueue.poll();
            processOrder(order);
        }
    }

    private void processOrder(Order order) {
        try {
            Thread.sleep(WAITER_PROCESS_TIME);
            System.out.println(name + " 의 주문을 처리중입니다. 주문번호 : " + order.orderNumber());
        } catch (InterruptedException e) {
            System.out.println(name + " 의 주문이 인터럽트 되었습니다. 주문번호 : " + order.orderNumber());
            throw new RuntimeException(e);
        }
    }

}
