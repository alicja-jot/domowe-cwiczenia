package siodmy.stream.forumUser.siodmy.stream.world;

import org.junit.Assert;
import org.junit.Test;
import siodmy.stream.world.Continent;
import siodmy.stream.world.Country;
import siodmy.stream.world.World;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //given
        Country poland = new Country("Poland", new BigDecimal("3000000"));
        Country england = new Country("England", new BigDecimal("7000000"));
        Country spain = new Country("Spain", new BigDecimal("10000000"));
        List<Country> europeCountries = new ArrayList<>();
        europeCountries.add(poland);
        europeCountries.add(england);
        europeCountries.add(spain);
        Continent europe = new Continent(europeCountries);

        Country russia = new Country("Russia", new BigDecimal("100000000"));
        Country japan = new Country("Japan", new BigDecimal("1000000"));
        Country israel = new Country("Israel", new BigDecimal("3000000"));
        List<Country> asianCountries = new ArrayList<>();
        asianCountries.add(russia);
        asianCountries.add(japan);
        asianCountries.add(israel);
        Continent asia = new Continent(asianCountries);

        List<Continent> continentsList = new ArrayList<>();
        continentsList.add(europe);
        continentsList.add(asia);
        World world = new World(continentsList);
        //when
        BigDecimal quantityOfAllPeople = world.getPeopleQuantity();
        //then
        Assert.assertEquals(new BigDecimal("124000000"), world.getPeopleQuantity());
    }
}
