package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent america = new Continent("America");
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Country newYork = new Country("New York", new BigDecimal("100000000"));
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country germany = new Country("Germany", new BigDecimal("82000000"));
        Country india = new Country("India", new BigDecimal("127000000"));
        Country japan = new Country("Japan", new BigDecimal("51000000"));
        //When
        europe.addCountry(poland);
        europe.addCountry(germany);
        asia.addCountry(india);
        asia.addCountry(japan);
        america.addCountry(newYork);
        world.addContinent(america);
        world.addContinent(europe);
        world.addContinent(asia);
        BigDecimal worldPopulation = world.getPeopleQuantity();

        //Then


        Assert.assertEquals(3, world.getContinents().size());

        Assert.assertEquals(1, america.getCountries().size());

        Assert.assertEquals(2, europe.getCountries().size());

        Assert.assertEquals(2, asia.getCountries().size());

        Assert.assertEquals(new BigDecimal("398000000"), worldPopulation);

    }
}