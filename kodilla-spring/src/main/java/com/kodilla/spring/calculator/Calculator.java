package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Calculator {
    @Resource
    private final Display display;

    public Calculator(Display display) {
        this.display = display;
    }
    double add(final double a, final  double b){
        final double result = a + b;
        display.displayValue(result);
        return result;
    }
    double sub(final double a, final double b){
        final double result = a - b;
        display.displayValue(result);
        return result;
    }
    double mul(final  double a, final double b){
        final double result = a * b;
        display.displayValue(result);
        return result;
    }
    double div(final double a, final double b){
        final double result = a / b;
        display.displayValue(result);
        return result;
    }
}
