package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheeseDecorator extends AbstractPizzaOrderDecorator {
    public ExtraCheeseDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost(){
        //hardcoded stub cost = 5
        return super.getCost().add(new BigDecimal(5));
    }
    @Override
    public String getComponents(){
        return super.getComponents() + " and also extra cheese";
    }
}
