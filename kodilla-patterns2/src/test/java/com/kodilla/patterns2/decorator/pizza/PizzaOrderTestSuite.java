package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost(){
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        //Then
        BigDecimal calculatedCost = order.getCost();
        //When
        assertEquals(new BigDecimal(10), calculatedCost);

    }
    @Test
    public void testBasicPizzaOrderGetComponents(){
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        //Then
        String components = order.getComponents();
        //When
        assertEquals("Pizza with tomato sauce and cheese", components);
    }
    @Test
    public void testExtraCheeseGetCost(){
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new ExtraCheeseDecorator(order);
        //When
        BigDecimal theCost = order.getCost();
        //Then
        assertEquals(new BigDecimal(15), theCost);
    }
    @Test
    public void testExtraCheeseGetComponents(){
        PizzaOrder order = new BasicPizzaOrder();
        order = new ExtraCheeseDecorator(order);
        //When
        String components = order.getComponents();
        //Then
        assertEquals("Pizza with tomato sauce and cheese" + " and also extra cheese", components);
    }
    @Test
    public void testVegetarianGetCost(){
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new VegetarianDecorator(order);
        //Then
        BigDecimal theCost = order.getCost();

        //When
        assertEquals(new BigDecimal(15), theCost);
    }
    @Test
    public void testVegetarianGetComponents(){
        //Given
        PizzaOrder order = new  BasicPizzaOrder();
        order = new VegetarianDecorator(order);
        //Then
        String components = order.getComponents();
        //When
        assertEquals("Pizza with tomato sauce and cheese" +  " with mushrooms", components);
    }
    @Test
    public void testOnionGetCost(){
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new OnionDecorator(order);
        //Then
        BigDecimal theCost = order.getCost();
        //When
        assertEquals(new BigDecimal(12), theCost);
    }
    @Test
    public void testOnionGetComponents(){
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new OnionDecorator(order);
        //When
        String components = order.getComponents();
        //Then
        assertEquals("Pizza with tomato sauce and cheese" + " + onion", components);
    }
    @Test
    public void testBasilGetCost(){
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new BasilDecorator(order);
        //Then
        BigDecimal theCost = order.getCost();
        //When
        assertEquals(new BigDecimal(13), theCost);
    }
    @Test
    public void testBasilDecoratorGetComponents(){
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new BasilDecorator(order);
        //Then
        String components = order.getComponents();
        assertEquals("Pizza with tomato sauce and cheese" + " + basil", components);
    }
    @Test
    public void testAllComponentsGetCost(){
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new ExtraCheeseDecorator(order);
        order = new VegetarianDecorator(order);
        order = new OnionDecorator(order);
        order = new BasilDecorator(order);
        //Then
        BigDecimal theCost = order.getCost();
        //When
        assertEquals(new BigDecimal(25), theCost);

        System.out.println("The cost of oder is:" + theCost);
    }
    @Test
    public void testAllGetComponents(){
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new ExtraCheeseDecorator(order);
        order = new VegetarianDecorator(order);
        order = new OnionDecorator(order);
        order = new BasilDecorator(order);
        //Then
        String components = order.getComponents();
        //When
        assertEquals("Pizza with tomato sauce and cheese" + " and also extra cheese"  +  " with mushrooms"
                + " + onion" + " + basil", components );

        System.out.println("Your order is:" + components);
        System.out.println("Bon appetit!!!");

    }

}
