package com.startupcode.interfaces.step4;

// PayPal 결제 구현
public class PayPalProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        // 결제 처리 작업.. 시작
        System.out.println("PayPal로 " + amount + "원을 결제합니다.");
        // 결제 처리 작업.. 종료
    }
}