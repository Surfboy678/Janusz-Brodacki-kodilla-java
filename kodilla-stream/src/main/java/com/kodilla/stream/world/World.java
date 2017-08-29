package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    private final Set<Continent> continents = new HashSet<>();

    public Set<Continent> getContinents() {
        return continents;
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(n -> n.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }
}


