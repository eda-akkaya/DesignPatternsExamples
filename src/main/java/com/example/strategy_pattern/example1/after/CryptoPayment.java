package com.example.strategy_pattern.example1.after;

public class CryptoPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Payment by crypto: " + amount);
    }
}
