package com.kodilla.good.paterns.challenges.challenges2;

public class Application {
    public  static void main(String args[]){


        ProductHealthyShop productHealthyShop = new ProductHealthyShop("Healthy Shop","Food" ,4);
        productHealthyShop.getQuantityProduct();

        System.out.print( productHealthyShop);

        System.out.println(" ");

        OrderInformation orderInformation = new OrderInformation();
        orderInformation.order();

        System.out.println(" ");

        ProcessHealthyShop processHealthyShop = new ProcessHealthyShop();
        processHealthyShop.isOrdered();






    }

}
