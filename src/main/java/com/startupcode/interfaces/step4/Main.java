package com.startupcode.interfaces.step4;

import com.startupcode.interfaces.step3.solved.CoffeeMaker;

public class Main {
    public static void main(String[] args) {
        // 신용카드 결제
        PaymentProcessor creditCardProcessor = new CreditCardProcessor();
        PaymentService creditCardPayment = new PaymentService(creditCardProcessor);
        creditCardPayment.makePayment(100.0); // 신용카드로 100.0원을 결제합니다.

        // PayPal 결제
        PaymentProcessor payPalProcessor = new PayPalProcessor();
        PaymentService payPalPayment = new PaymentService(payPalProcessor);
        payPalPayment.makePayment(200.0); // PayPal로 200.0원을 결제합니다.

        // 모바일 결제
        PaymentProcessor mobileProcessor = new MobileProcessor();
        PaymentService mobilePayment = new PaymentService(mobileProcessor);
        mobilePayment.makePayment(150.0); // 모바일 결제로 150.0원을 결제합니다.
    }
}
