package com.kodilla.good.paterns.food2door;

public class ExtraFoodShop implements Provider {
    private  double price;

    public ExtraFoodShop(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean process(Order order) {
        System.out.println("Order from ExtaraFoodShop:" + order);
        return true;
    }
}
