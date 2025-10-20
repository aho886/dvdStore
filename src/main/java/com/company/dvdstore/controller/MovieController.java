package com.company.dvdstore.controller;

import com.company.dvdstore.entity.Movie;
import com.company.dvdstore.service.MovieService;

import java.util.Scanner;

public class MovieController {
    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    public void addMovie() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom d'un film : ");
        String name = scanner.nextLine();

        Movie movie = new Movie();
        movie.setTitle(name);

        movieService.registerMovie(movie);
    }
}
