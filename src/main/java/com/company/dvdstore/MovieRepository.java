package com.company.dvdstore;

import com.company.dvdstore.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    private List<Movie> movies = new ArrayList<>();
    public void add(Movie movie) {
        movies.add(movie);
        System.out.println("Le film "+movie.getTitle()+" a été ajouté.");
    }

    public List<Movie> getAllMovies() {
        return movies;
    }
}
