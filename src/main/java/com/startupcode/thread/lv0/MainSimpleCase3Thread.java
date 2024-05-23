package com.startupcode.thread.lv0;

/**
 * Thread 는 Runnable 의 구현체이므로 Runnable은 필수가 아니다.
 * Thread.start() 를 호출 하면 해당 스레드 내부에 있는 run() 함수가 호출된다.
 */
public class MainSimpleCase3Thread {
    public static void main(String[] args) {
        Thread thread = new Task("첫 번째 작업");
        thread.start();
    }

    public static class Task extends Thread {
        private final String taskName;

        public Task(String taskName) {
            this.taskName = taskName;
        }

        @Override
        public void run() {
            System.out.println(taskName + " 작업을 수행하고 있습니다.");
        }
    }
}
