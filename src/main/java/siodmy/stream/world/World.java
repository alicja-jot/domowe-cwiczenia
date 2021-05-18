package siodmy.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Continent> continentsList;

    public World(List<Continent> continentsList) {
        this.continentsList = continentsList;
    }

    public List<Continent> getContinentsList() {
        return continentsList;
    }

    public BigDecimal getPeopleQuantity () {
        return continentsList.stream()
                .flatMap(c -> c.getCountrysList().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }


}
