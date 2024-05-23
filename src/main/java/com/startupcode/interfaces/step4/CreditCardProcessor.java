package com.startupcode.interfaces.step4;

// 신용카드 결제 구현
public class CreditCardProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        // 결제 처리 작업.. 시작
        System.out.println("신용카드로 " + amount + "원을 결제합니다.");
        // 결제 처리 작업.. 종료
    }
}

