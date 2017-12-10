package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class VegetarianDecorator extends AbstractPizzaOrderDecorator {
    public VegetarianDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost(){
        //hardcoded stub cost = 5
        return super.getCost().add(new BigDecimal(5));
    }
    @Override
    public String getComponents(){
        return super.getComponents() + " with mushrooms";
    }
}
