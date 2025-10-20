package com.company.dvdstore.controller;
import com.company.dvdstore.entity.Movie;
import com.company.dvdstore.service.MovieServiceConsole;

import java.util.Scanner;


public class MovieControllerConsole {
    private MovieServiceConsole movieServiceConsole;

    public MovieControllerConsole(MovieServiceConsole movieServiceConsole) {
        this.movieServiceConsole = movieServiceConsole;
    }

    public void addMovieConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom d'un film : ");
        String name = scanner.nextLine();

        Movie movie = new Movie();
        movie.setTitle(name);
        movieServiceConsole.displayConsole(movie);
    }
}
