package com.startupcode.thread._semaphore;

class Worker implements Runnable {
    private final SharedResource sharedResource;

    public Worker(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        sharedResource.increment();
    }
}
