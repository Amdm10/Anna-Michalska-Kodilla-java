package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent northamerica = new Continent("North America");
        Continent asia = new Continent("Asia");
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(northamerica);
        world.addContinent(asia);
        europe.addCountrie(new Country("Poland",new BigDecimal("38476269")));
        europe.addCountrie(new Country("Germany",new BigDecimal("80594017")));
        africa.addCountrie(new Country("Morocco",new BigDecimal("33986655")));
        africa.addCountrie(new Country("Sudan",new BigDecimal("37345935")));
        northamerica.addCountrie(new Country("USA", new BigDecimal("326625791")));
        northamerica.addCountrie(new Country("Canada", new BigDecimal("35623680")));
        asia.addCountrie(new Country("India", new BigDecimal("1281935911")));
        asia.addCountrie(new Country("Thailand", new BigDecimal("68414135")));
        asia.addCountrie(new Country("Cambodia", new BigDecimal("16204486")));
        //When
        BigDecimal result = world.getPeopleQuantity();
        //Then
        BigDecimal expectedResult = new BigDecimal("1919206879");
        Assert.assertEquals(expectedResult, result);
    }
}
