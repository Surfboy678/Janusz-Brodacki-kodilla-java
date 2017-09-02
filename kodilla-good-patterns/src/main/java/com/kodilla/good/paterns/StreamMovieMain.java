package com.kodilla.good.paterns;

import java.util.stream.Collectors;

public class StreamMovieMain {
    public static void main(String args[]){

        MovieStore movieStore = new MovieStore();

       String theResultStringOfMovieStore =  movieStore.getList().stream()
               .map(Movie::toString)
               .collect(Collectors.joining("!", "<<", ">>"));

       System.out.println(theResultStringOfMovieStore);
    }

}

