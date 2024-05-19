package com.startupcode.thread.lv2.without;

public class KitchenWithoutThreads {
    public static void main(String[] args) {
        ChopVegetables chopVegetables = new ChopVegetables();
        GrillMeat grillMeat = new GrillMeat();
        MakeSalad makeSalad = new MakeSalad();
        chopVegetables.proc();
        grillMeat.proc();
        makeSalad.proc();
    }
}