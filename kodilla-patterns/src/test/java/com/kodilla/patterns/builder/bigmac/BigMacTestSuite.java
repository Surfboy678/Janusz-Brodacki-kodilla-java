package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacBuilder() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .roll(BigMac.SESAME)
                .quantityBurgers(8)
                .sauce(BigMac.THOUSAND_ISLANDS)
                .ingredient(BigMac.ONIONS)
                .ingredient(BigMac.CHILI)
                .ingredient(BigMac.SALAD)
                .ingredient(BigMac.BACON)
                .build();
        System.out.println(bigMac);
        //When
        int howManyBurgers = bigMac.getBurgers();
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(8,howManyBurgers);
        Assert.assertEquals(4,howManyIngredients);
    }
}