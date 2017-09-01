package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightList = new HashMap<>();
        flightList.put("Madrid", false);
        flightList.put("Berlin", true);
        flightList.put("Porto", false);
        flightList.put("Roma", true);
        if (!flightList.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException();
        }
        return flightList.get(flight.getDepartureAirport());
    }

}
