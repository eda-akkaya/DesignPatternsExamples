package com.example.ObserverPattern.example2;

import java.util.ArrayList;
import java.util.List;
/*
Publisher bir liste tutar,
Subscriber'lar kayıt olur,
Durumu değişince notify edilir.

 */
public class OrderService implements Subject{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void createOrder(){
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers){
            o.update("order created");
        }
    }
}
