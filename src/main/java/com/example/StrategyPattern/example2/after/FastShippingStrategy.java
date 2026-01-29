package com.example.StrategyPattern.example2.after;
// Concrete Strategy

public class FastShippingStrategy implements ShippingCostStrategy {
    @Override
    public double calculate(double weight) {
        return weight * 10 + 60;
    }
}
