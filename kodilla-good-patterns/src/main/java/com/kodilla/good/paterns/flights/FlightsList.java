package com.kodilla.good.paterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsList {
    private final List<Flights> flights = new ArrayList<>();

    public FlightsList(){
        flights.add(new Flights("Warsaw", "Krakow"));
        flights.add(new Flights("Gran Canaria", "Warsaw"));
        flights.add(new Flights("Berlin", "Warsaw"));
        flights.add(new Flights("Lisbon", "Porto"));
        flights.add(new Flights("Bali", "Amsterdam"));
    }
    public List<Flights> getFlights(){
        return new ArrayList<>(flights);
    }
}
