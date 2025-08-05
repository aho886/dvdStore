package com.company.dvdstore;

import com.company.dvdstore.entity.Movie;
import com.company.dvdstore.service.MovieService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = new MovieService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom d'un film: ");
        String movieName = scanner.nextLine();
        Movie newMovie = new Movie();
        newMovie.setTitle(movieName);
        movieService.registerMovie(newMovie);




    }
}