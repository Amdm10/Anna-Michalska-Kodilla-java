package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public final class World {
    private final List<Continent> continents = new ArrayList<>();

    public void addContinents(Continent continent) {
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal totalQuantity = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current) );
        return totalQuantity;


    }
}
