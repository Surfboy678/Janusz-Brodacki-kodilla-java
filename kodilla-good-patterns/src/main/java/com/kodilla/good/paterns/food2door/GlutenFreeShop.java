package com.kodilla.good.paterns.food2door;

public class GlutenFreeShop implements Provider {
        private double price;

    public GlutenFreeShop(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean process(Order order) {
        System.out.println("Order is ready");
        return true;
    }
}
