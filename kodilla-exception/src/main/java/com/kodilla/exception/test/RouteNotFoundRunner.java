package com.kodilla.exception.test;

public class RouteNotFoundRunner {
    public static void main(String args[]) {
        FindFlight findFlight = new FindFlight();
        Flight radom = new Flight("Radom","Warsaw");

        try {
            if (findFlight.findFlight(radom)) {
                System.out.println("Flight is available");
            } else {
                System.out.println("Flight is not available");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Your airport is not exist.\n" + e);
        }

    }
}