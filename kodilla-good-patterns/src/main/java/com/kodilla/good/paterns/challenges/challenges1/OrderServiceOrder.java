package com.kodilla.good.paterns.challenges.challenges1;

public class OrderServiceOrder implements OrderService {
    public boolean order(User user,Product product){
        System.out.println("Order for" + user + "Product:" + product);
        return true;
    }
}
