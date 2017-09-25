package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sum = calculator.add(12.1,3.2);
        double sub = calculator.sub(18.4,3);
        double mul = calculator.mul(12.3,2.1);
        double div = calculator.div(25.2,4.1);
        // Then
        Assert.assertEquals(sum,15.3,0);
        Assert.assertEquals(sub,15.399999999999999,0);
        Assert.assertEquals(mul,25.830000000000002,0);
        Assert.assertEquals(div,6.146341463414634,0);


    }
}
