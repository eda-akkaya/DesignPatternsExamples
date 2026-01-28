package com.example.strategy_pattern.example2.after;
// Context sınıfı
public class ShippingService {
    private final ShippingCostStrategy shippingCostStrategy;

    public ShippingService(ShippingCostStrategy shippingCostStrategy){
        this.shippingCostStrategy = shippingCostStrategy;
    }

    public double calculate(double weight){
        return shippingCostStrategy.calculate(weight);
    }
}
