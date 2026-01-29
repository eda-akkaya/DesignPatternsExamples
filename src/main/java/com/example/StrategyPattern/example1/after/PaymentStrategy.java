package com.example.StrategyPattern.example1.after;

// tüm ödeme yöntemlerinin uyması gereken kontrat
public interface PaymentStrategy {

    void pay(double amount);
}
