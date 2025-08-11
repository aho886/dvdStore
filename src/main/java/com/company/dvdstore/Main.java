package com.company.dvdstore;

import com.company.dvdstore.controller.MovieController;
import com.company.dvdstore.entity.Movie;
import com.company.dvdstore.repository.GoLiveMovieRepository;
import com.company.dvdstore.service.MovieService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GoLiveMovieRepository goLiveMovieRepository = new GoLiveMovieRepository();
        MovieService movieService = new MovieService(goLiveMovieRepository);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom d'un film : ");
        String name = scanner.nextLine();
        Movie movie = new Movie();
        movie.setTitle(name);

        movieService.registerMovie(movie);


    }
}