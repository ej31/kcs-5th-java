package com.startupcode.thread.lv0;

/**
 * Thread 에 Runnable 을 배정하기
 */
class MainSimpleCase2Thread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Task("첫 번째 작업"));
        thread.start();
    }

    public static class Task implements Runnable {
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
