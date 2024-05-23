package com.startupcode.interfaces.step4;

// 결제 서비스 클래스
public class PaymentService {
    private final PaymentProcessor paymentProcessor;

    // 생성자 주입
    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void makePayment(double amount) {
        // 결제 요청 시작
        paymentProcessor.processPayment(amount);
        // 결제 요청 종료

        // 결제 마무리 됐으니 DB 관련 작업.. 시작

        // Some Code..

        // 종료
    }
}
