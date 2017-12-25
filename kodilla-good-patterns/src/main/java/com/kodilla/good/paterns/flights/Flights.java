package com.kodilla.good.paterns.flights;

public class Flights {
    private String flightFrom;
    private String flightTo;

    public Flights(String flightFrom, String flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    public String getFlightFrom() {
        return flightFrom;
    }


    public String getFlightTo() {
        return flightTo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flights flights = (Flights) o;

        if (flightFrom != null ? !flightFrom.equals(flights.flightFrom) : flights.flightFrom != null) return false;
        return flightTo != null ? flightTo.equals(flights.flightTo) : flights.flightTo == null;
    }

    @Override
    public int hashCode() {
        int result = flightFrom != null ? flightFrom.hashCode() : 0;
        result = 31 * result + (flightTo != null ? flightTo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "flightFrom='" + flightFrom + '\'' +
                ", flightTo='" + flightTo + '\'' +
                '}';
    }
}
