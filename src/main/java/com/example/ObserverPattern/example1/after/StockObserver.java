package com.example.ObserverPattern.example1.after;

// stok değişikliklerini dinleyen tüm sınıflar için ortak arayüz
public interface StockObserver {
    void onStockChanged(int newStock);

}
