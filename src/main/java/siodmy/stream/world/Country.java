package siodmy.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {

    private final String name;
    private final BigDecimal quantity;

    public Country(String name, BigDecimal quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public BigDecimal getPeopleQuantity(){
        return quantity;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name) &&
                Objects.equals(quantity, country.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantity);
    }
}
