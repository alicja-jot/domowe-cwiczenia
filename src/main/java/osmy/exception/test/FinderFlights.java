package osmy.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FinderFlights {

    Map<String, Boolean> availableFlightsMap = new HashMap<>();

    FinderFlights(){
        availableFlightsMap.put("Malaga", true);
        availableFlightsMap.put("Rome", true);
        availableFlightsMap.put("Tokyo", false);
    }


    public boolean findFilght(Flight flight) throws RouteNotFoundException {
        String arivalAirport = flight.getArrivalAirport();
        if(availableFlightsMap.containsKey(arivalAirport)){
            return availableFlightsMap.get(arivalAirport);
        }else {
            throw new RouteNotFoundException("This airport is not available.");
        }

    }

}
