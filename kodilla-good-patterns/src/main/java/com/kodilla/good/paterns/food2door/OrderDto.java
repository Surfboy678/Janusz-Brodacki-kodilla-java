package com.kodilla.good.paterns.food2door;

public class OrderDto {
    private Order order;
    public boolean isOrdered;

    public OrderDto(Order order, boolean isOrdered) {
        this.order = order;
        this.isOrdered = isOrdered;
    }

    public Order getOrder() {
        return order;
    }


    public boolean isOrdered() {
        return isOrdered;
    }
}

