package com.example.StrategyPattern.example2.before;

public class ShippingService {

    public double calculate(String companyType, double weight){
        // Firma sayısı arttıkça bu sınıf aşırı büyür

        return switch (companyType) {
            case "FAST" -> weight * 10 + 50;
            case "ECONOMY" -> weight * 5 + 20;
            case "INTERNATIONAL" -> weight * 20 + 100;
            default -> throw new IllegalArgumentException("Invalid shipping company!!");
        };

    }
}
