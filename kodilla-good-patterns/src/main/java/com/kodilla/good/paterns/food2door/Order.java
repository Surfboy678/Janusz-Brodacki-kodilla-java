package com.kodilla.good.paterns.food2door;

public class Order {

    private Provider provider;
    private String foodType;
    private int quantity;
    private double price;
    private double orderValue;

    public Order(Provider provider, String foodType, int quantity, double price, double orderValue) {
        this.provider = provider;
        this.foodType = foodType;
        this.quantity = quantity;
        this.price = price;
        this.orderValue = orderValue;
    }




    public Provider getProvider() {
        return provider;
    }

    public String getFoodType() {
        return foodType;
    }

    public int getQuantity() {
        return quantity;
    }



    public double getOrderValue() {
        return orderValue;
    }

    @Override
    public String toString() {
        return "Order{" +
                "provider=" + provider +
                ", foodType='" + foodType + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", orderValue=" + orderValue +
                '}';
    }
}
