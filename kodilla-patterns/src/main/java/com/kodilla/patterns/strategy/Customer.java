package com.kodilla.patterns.strategy;

public class Customer {
    protected BuyPredictor buyPredictor;
    final private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String predict() {
        return buyPredictor.predictWhatToBuy();
    }

    public void setBuyingStrategy(BuyPredictor buyPredictor) {
        this.buyPredictor = buyPredictor;
    }
}
