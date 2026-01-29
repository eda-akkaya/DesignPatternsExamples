package com.example.ObserverPattern.example1.after;

// stok değişikliklerini loglayan observer
public class LoggingObserver implements StockObserver{

    @Override
    public void onStockChanged(int newStock) {
        System.out.println("Logged. Updated stock: " + newStock);
    }
}
