package com.example.ObserverPattern.example2;

public interface Subject {
    void addObserver(Observer observer);
    void notifyObservers();
}
