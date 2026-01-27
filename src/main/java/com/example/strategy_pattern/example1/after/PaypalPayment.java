package com.example.strategy_pattern.example1.after;

public class PaypalPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Payment by paypal: " + amount);
    }
}
