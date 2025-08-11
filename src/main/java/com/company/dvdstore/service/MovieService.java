package com.company.dvdstore.service;

import com.company.dvdstore.MovieRepository;
import com.company.dvdstore.entity.Movie;
import com.company.dvdstore.repository.GoLiveMovieRepository;

public class MovieService {
    GoLiveMovieRepository movieRepository;

    public MovieService(GoLiveMovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    public void registerMovie(Movie movie){
        movieRepository.add(movie);
    }

}
