package com.kodilla.good.paterns.flights;

public class Application {
    public static void main(String args[]){
        SearchingFlights searchingFlights = new SearchingFlights("Bali","Amsterdam" );
        searchingFlights.fromCityToCity();
        searchingFlights.toCity();
        searchingFlights.fromCityToCityWithConnecting();
    }
}
