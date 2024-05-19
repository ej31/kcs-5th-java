package com.startupcode.thread.lv2.with;


public class KitchenWithThread {
    public static void main(String[] args) {
        // 각 작업을 담당하는 스레드들을 만들어요.
        ChopVegetables chopVegetables = new ChopVegetables();
        GrillMeat grillMeat = new GrillMeat();
        MakeSalad makeSalad = new MakeSalad();

        // 스레드들을 시작해요.
        chopVegetables.start();
        grillMeat.start();
        makeSalad.start();
    }
}