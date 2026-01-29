package com.example.StrategyPattern.example2.after;

public class Main {
    public static void main(String[] args) {
        ShippingService service1 = new ShippingService(new FastShippingStrategy());
        ShippingService service2 = new ShippingService(new EconomyShippingStrategy());

        double cost1 = service1.calculate(14);
        System.out.println("ship cost: " + cost1);

        double cost2 = service2.calculate(15);
        System.out.println("ship cost: " + cost2);
    }
}
