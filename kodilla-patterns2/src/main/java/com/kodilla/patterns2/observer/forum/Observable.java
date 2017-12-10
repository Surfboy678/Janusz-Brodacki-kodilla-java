package com.kodilla.patterns2.observer.forum;

public interface Observable {
    void registerObserver(Observer observer);

    void registerObserver(java.util.Observer observer);

    void notifyObservers();
    void removeObserver(Observer observer);

    void removeObserver(java.util.Observer observer);
}