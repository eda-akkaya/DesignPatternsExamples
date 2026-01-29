package com.example.StrategyPattern.example1.after;

public class PaypalPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Payment by paypal: " + amount);
    }
}
