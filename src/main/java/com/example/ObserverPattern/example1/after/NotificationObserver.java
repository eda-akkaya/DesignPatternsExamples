package com.example.ObserverPattern.example1.after;

// kullanıcılara bildirim gönderen observer

public class NotificationObserver implements StockObserver{

    @Override
    public void onStockChanged(int newStock) {
        System.out.println("Notifications were sent to users. New stock:" + newStock);
    }
}
