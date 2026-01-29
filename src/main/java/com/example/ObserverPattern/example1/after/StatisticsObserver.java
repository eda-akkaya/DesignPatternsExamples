package com.example.ObserverPattern.example1.after;

// istatistikleri güncelleyen observer
public class StatisticsObserver implements StockObserver{
    @Override
    public void onStockChanged(int newStock) {
        System.out.println("Statistics updated. Stock: " + newStock);
    }
}
