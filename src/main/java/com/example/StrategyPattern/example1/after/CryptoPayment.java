package com.example.StrategyPattern.example1.after;

public class CryptoPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Payment by crypto: " + amount);
    }
}
