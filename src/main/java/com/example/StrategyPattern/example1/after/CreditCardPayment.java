package com.example.StrategyPattern.example1.after;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Payment by credit card: " + amount);
    }
}
