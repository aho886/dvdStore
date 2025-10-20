package com.company.dvdstore.repository;

import com.company.dvdstore.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository implements MovieRepositoryConsoleInterface {
    private List<Movie> movies = new ArrayList<>();

    public void addMovieConsole(Movie movie) {
        movies.add(movie);
        System.out.println("Le film "+movie.getTitle()+" a été ajouté.");
    }

    public List<Movie> getAllMoviesConsole() {
        return movies;
    }
}
