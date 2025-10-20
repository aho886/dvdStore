package com.company.dvdstore.service;

import com.company.dvdstore.entity.Movie;
import com.company.dvdstore.repository.GoLiveMovieRepository;

public class MovieService implements MovieServiceInterface {
    GoLiveMovieRepository movieRepository;

    //getter/setter
    public GoLiveMovieRepository getMovieRepository() {
        return movieRepository;
    }
    public void setMovieRepository(GoLiveMovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    //constructeur
    public MovieService(GoLiveMovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie registerMovie(Movie movie){
        movieRepository.add(movie);
        return movie;
    }



}
