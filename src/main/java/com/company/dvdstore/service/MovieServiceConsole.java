package com.company.dvdstore.service;

import com.company.dvdstore.entity.Movie;
import com.company.dvdstore.repository.MovieRepository;

public class MovieServiceConsole implements MovieServiceInterfaceConsole{
    private MovieRepository movieRepository;

    public MovieServiceConsole(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie displayConsole(Movie movie) {
        movieRepository.addMovieConsole(movie);
        return movie;
    }

    public MovieRepository getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
}
