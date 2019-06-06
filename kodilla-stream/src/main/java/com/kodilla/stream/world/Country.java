package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final String country;
    private final BigDecimal quantity;

    public Country(String country, BigDecimal quantity) {
        this.country = country;
        this.quantity = quantity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country1 = (Country) o;
        return Objects.equals(country, country1.country) &&
                Objects.equals(quantity, country1.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, quantity);
    }

    public BigDecimal getPeopleQuantity() {
        return quantity;
    }

    public String getCountry() {
        return country;
    }

}
