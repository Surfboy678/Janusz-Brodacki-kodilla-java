package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost(){
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(5), calculatedCost);
        }
        @Test
    public void testBasicTaxiOrderGrtDescription(){
        //Given
            TaxiOrder theOrder = new BasicTaxiOrder();
            //When
            String description = theOrder.getDescription();

            assertEquals("Drive a course", description);
        }
        @Test
    public void testTaxiNetworkGetCost(){
        //Given
            TaxiOrder theOrder = new BasicTaxiOrder();
            theOrder = new TaxiNetworkOrderDecorator(theOrder);
            //When
            BigDecimal theCost = theOrder.getCost();
            //Then
            assertEquals(new BigDecimal(40), theCost);
        }
        @Test
    public void testTaxiNetworkGetDescription(){
        //Given
            TaxiOrder theOrder = new BasicTaxiOrder();
            theOrder = new TaxiNetworkOrderDecorator(theOrder);
            //When
            String description = theOrder.getDescription();
            //Then
            assertEquals("Drive a course" + "by taxi network", description);
        }
    }

