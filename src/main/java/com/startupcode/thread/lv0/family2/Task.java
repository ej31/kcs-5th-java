package com.startupcode.thread.lv0.family2;

// 작업을 나타내는 클래스 (Runnable 구현)
class Task implements Runnable {
    private final String taskName;
    private String executerName;

    // 생성자
    public Task(String taskName) {
        this.taskName = taskName;
    }

    public Task(String taskName, String executerName) {
        this.taskName = taskName;
        this.executerName = executerName;
    }

    // run 메서드를 오버라이드하여 작업을 정의
    @Override
    public void run() {
        // null check
        if (this.executerName != null && !this.executerName.isEmpty()) {
            System.out.println(this.executerName + "(이)가 " + taskName + "를 시작합니다.");
        } else if (this.executerName == null) {
            System.out.println(taskName + "를 시작합니다.");
        } else {
            throw new Error("생성자 혹은 실행자 이름이 비어있습니다.");
        }
        try {
            // 작업을 수행하는 데 걸리는 시간(예: 2초)
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(taskName + " 작업 중단됨");
        }
        System.out.println(taskName + "를 끝냈습니다.");
    }
}
