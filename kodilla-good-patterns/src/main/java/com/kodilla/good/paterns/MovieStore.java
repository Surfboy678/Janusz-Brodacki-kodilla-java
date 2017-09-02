package com.kodilla.good.paterns;

import java.util.ArrayList;
import java.util.List;

public final class MovieStore {
    private final List<Movie> movieList = new ArrayList<>();

        public MovieStore(){
            movieList.add(new Movie("Żelazny Człowiek"));
            movieList.add(new Movie("Iron Man"));
            movieList.add(new Movie("Mściciele"));
            movieList.add(new Movie("Avengers"));
            movieList.add(new Movie("Błyskawica"));
            movieList.add(new Movie("Flash"));

        }
        public List<Movie> getList(){
            return new ArrayList<>(movieList);
        }

    }

