package com.company.dvdstore.service;

import com.company.dvdstore.MovieRepository;
import com.company.dvdstore.entity.Movie;

public class MovieService {
    MovieRepository movieRepository = new MovieRepository();
    public void registerMovie(Movie movie){
        movieRepository.add(movie);
    }

}
