package com.example.ObserverPattern.example1.after;

public class Main {
    public static void main(String[] args) {

        BookStockService stockService = new BookStockService();

        stockService.addObserver(new NotificationObserver());
        stockService.addObserver(new LoggingObserver());
        stockService.addObserver(new StatisticsObserver());

        stockService.addStock(5);
    }
}
