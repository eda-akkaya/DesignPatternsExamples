package com.example.ObserverPattern.example1.after;

import java.util.ArrayList;
import java.util.List;

// subject(observable) class -> observer listesini yönetir

public class BookStockService {
    private int stock = 0;
    private List<StockObserver> observers = new ArrayList<>();

    public void addObserver(StockObserver observer){
        observers.add(observer);
    }

    public void removeObserver(StockObserver observer){
        observers.remove(observer);
    }

    public void addStock(int amount){
        stock+= amount;
        notifyObservers();
    }
    public void notifyObservers(){
        for (StockObserver observer : observers){
            observer.onStockChanged(stock);
        }

    }
}
