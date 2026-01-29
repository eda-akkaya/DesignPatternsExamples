package com.example.ObserverPattern.example1.before;

public class BookStockService {

    private int stock;
    public void addStock(int amount){
        stock += amount;

        // değişiklik sonrası, etkilenen tüm sınıflar çağrılıyor -> tight coupling
        NotificationService.notifyUsers(stock);
        LoggingService.log(stock);
        StatisticsService.update(stock);
    }
}
