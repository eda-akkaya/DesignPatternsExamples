package com.example.strategy_pattern.example1.after;

// tüm ödeme yöntemlerinin uyması gereken kontrat
public interface PaymentStrategy {

    void pay(double amount);
}
