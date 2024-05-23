package com.startupcode.interfaces.step1;

public class MainInterfaceCase {
    public static void main(String[] args) {

        InterfaceParent ip = new InterfaceParentImpl();
        ip.m1();
        InterfaceParent.m2();
    }
}
