package com.startupcode._playground;

class VehicleImpl implements Vehicle {
    @Override
    public void start() {
        System.out.println(this.MAX_SPEED);
    }

    @Override
    public void stop() {

    }
}