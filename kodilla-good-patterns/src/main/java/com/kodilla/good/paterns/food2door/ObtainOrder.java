package com.kodilla.good.paterns.food2door;

public class ObtainOrder {

    protected Order obtain(){
        Provider extraFood = new ExtraFoodShop(26.30);
        Order extraFoodOrder = new Order(extraFood, "Spirulina", 20, 23.20, 30);
        return extraFoodOrder;
    }
}
