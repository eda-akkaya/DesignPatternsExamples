package com.example.strategy_pattern.example2.after;
// Concrete Strategy
public class EconomyShippingStrategy implements ShippingCostStrategy {

    @Override
    public double calculate(double weight) {
        return weight * 5 + 20;
    }
}