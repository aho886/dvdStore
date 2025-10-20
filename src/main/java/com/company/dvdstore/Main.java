package com.company.dvdstore;

import com.company.dvdstore.controller.MovieController;
import com.company.dvdstore.controller.MovieControllerConsole;
import com.company.dvdstore.entity.Movie;
import com.company.dvdstore.repository.GoLiveMovieRepository;
import com.company.dvdstore.repository.MovieRepository;
import com.company.dvdstore.service.MovieService;
import com.company.dvdstore.service.MovieServiceConsole;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GoLiveMovieRepository goLiveMovieRepository = new GoLiveMovieRepository();
        MovieService movieService = new MovieService(goLiveMovieRepository);
        MovieController movieController = new MovieController(movieService);

        MovieRepository movieRepository = new MovieRepository();
        MovieServiceConsole movieServiceConsole = new MovieServiceConsole(movieRepository);
        MovieControllerConsole movieControllerConsole = new MovieControllerConsole(movieServiceConsole);

        movieControllerConsole.addMovieConsole();
        movieController.addMovie();



    }
}