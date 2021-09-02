package osmy.exception.test;

public class Aps {
    public static void main(String[] args) {

        FinderFlights finderFlights = new FinderFlights();
        Flight flight1 = new Flight("Tokyo", "Tokyo");

        try {
            boolean isFlight = finderFlights.findFilght(flight1);
            System.out.println("Is fly available? --> " + isFlight);
        }catch (RouteNotFoundException e){
            System.out.println("You cant fly there, cause: " + e.getMessage());
        }

    }
}
