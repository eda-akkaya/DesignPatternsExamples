package com.example.strategy_pattern.example2.after;

/**
 * Kargo ücret hesaplama stratejileri için ortak interface
 */

public interface ShippingCostStrategy {
    double calculate(double weight);
}
