package com.kodilla.good.paterns.challenges.challenges1;

public class OrderRepositoryOrder implements OrderRepository {
    public boolean createOrder(User user, Product product){
        System.out.println("Order success");
        return true;
    }
}
