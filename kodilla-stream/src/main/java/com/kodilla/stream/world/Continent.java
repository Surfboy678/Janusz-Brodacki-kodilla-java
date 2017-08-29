package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final String continent;
    private final Set<Country> countries = new HashSet<>();

    public Continent(final String continent) {
        this.continent = continent;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public Set<Country> getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent1 = (Continent) o;

        return continent.equals(continent1.continent);
    }
}

