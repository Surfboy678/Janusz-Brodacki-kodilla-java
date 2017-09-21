package com.kodilla.good.paterns.challenges.challenges1;

public class Application {
    public  static void main(String args[]){
        MailService mailService = new MailService();
        OrderServiceOrder orderServiceOrder = new OrderServiceOrder();
        OrderRepositoryOrder orderRepositoryOrder = new OrderRepositoryOrder();

        User user = new User("John", "Smith");
        Product product = new Product("Laptop HP");
        OrderRequest order = new OrderRequest(user,product);
        ProductOrderService productOrderService = new ProductOrderService(mailService,orderServiceOrder,orderRepositoryOrder);
        productOrderService.process(order);
    }
}
