package com.example.strategy_pattern.example1.after;

// yeni ödeme yöntemi eklemek için yeni bir sınıf eklenir, mevcut kod değişmez.
public class Main {

    public static void main(String[] args) {

        PaymentService service1 = new PaymentService(new CreditCardPayment());
        PaymentService service2 = new PaymentService(new CryptoPayment());

        service1.pay(50);
        service2.pay(2500);
    }
}
