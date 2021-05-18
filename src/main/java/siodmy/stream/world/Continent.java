package siodmy.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final List<Country> countrysList;

    public Continent(List<Country> countrysList) {
        this.countrysList = countrysList;
    }

    public List<Country> getCountrysList() {
        return countrysList;
    }
}
