package com.kodilla.good.paterns.food2door;

public class MailService implements InformationService {
    @Override
    public void info(Provider Provider, Order order) {
        if(Provider.process(order)){
            System.out.println("Order success");
        }else {
            System.out.println("order is error");
        }
    }
}
