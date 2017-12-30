package com.kodilla.good.paterns.food2door;

public class Application {
    public static void main(String args[]) {
        ObtainOrder obtainOrder = new ObtainOrder();

        Order order = obtainOrder.obtain();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new Delivere());
        orderProcessor.createOrderDto(order);


    }




}
