package com.kodilla.good.paterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class SearchingFlights {
    private String from;
    private String toCity;

    FlightsList flightsList = new FlightsList();

    public SearchingFlights(String from, String toCity) {
        this.from = from;
        this.toCity = toCity;
    }
    public void toCity() {
        System.out.println("Flights to " + toCity);

        List<Flights> flightsTo = flightsList.getFlights().stream()
                .filter(x -> x.getFlightTo().equals(toCity))
                .collect(Collectors.toList());
        if (flightsTo.size() > 0) {
            flightsTo.stream()
                    .forEach(System.out::println);
        } else  {
            System.out.println(" No flights ");
        }
        System.out.println("...Search completed");
    }

    public void fromCityToCity() {
        System.out.println("Flights from " + from + " to " + toCity );

        List<Flights> flightsFromTo = flightsList.getFlights().stream()
                .filter(x -> x.getFlightFrom().equals(from) && x.getFlightTo().equals(toCity))
                .collect(Collectors.toList());

        if(flightsFromTo.size() > 0) {
            flightsFromTo.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println(" no flights from ");
        }
        System.out.println("...Search completed");
    }


    public void fromCityToCityWithConnecting() {
        System.out.println("Connecting flight from " + from + " to " + toCity );

        List<Flights> flightsFrom = flightsList.getFlights().stream()
                .filter(x -> x.getFlightFrom().equals(from))
                .collect(Collectors.toList());
        List<Flights> flightsTo = flightsList.getFlights().stream()
                .filter(x -> x.getFlightTo().equals(toCity))
                .collect(Collectors.toList());

        if(flightsFrom.size() > 0 && flightsTo.size() > 0) {
            for(int i = 0; i < flightsFrom.size(); i++) {
                Flights resultFrom = flightsFrom.get(i);
                for (int n = 0; n < flightsTo.size(); n++) {
                    Flights resultTo = flightsTo.get(n);
                    if (resultTo.getFlightFrom().equals(resultFrom.getFlightTo())) {
                        System.out.println(resultFrom + " - " + resultTo);
                    }
                }
            }
        } else {
            System.out.println(" no flights from ");
        }
        System.out.println("...Search completed");
    }
}

