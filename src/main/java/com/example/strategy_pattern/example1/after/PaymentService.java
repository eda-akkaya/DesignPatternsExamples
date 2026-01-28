package com.example.strategy_pattern.example1.after;

/**
    Context sınıfı
    Ödeme davranışının nasıl yapıldığını bilmez
 */
public class PaymentService {

    private final PaymentStrategy paymentStrategy;

    // Strategy, constructor üzerinden enjekte edilir
    public PaymentService(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount){
        paymentStrategy.pay(amount);
    }
}
