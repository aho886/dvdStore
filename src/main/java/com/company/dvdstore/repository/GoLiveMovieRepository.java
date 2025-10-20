package com.company.dvdstore.repository;

import com.company.dvdstore.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GoLiveMovieRepository implements MovieRepositoryInterface {
    private List<Movie> movies = new ArrayList<>();
    public void add(Movie movie) {
        movies.add(movie);
        saveTextFile(movie);
        System.out.println("Le film "+movie.getTitle()+" a été ajouté au fichier.");
    }


    private void saveTextFile(Movie movie) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("C:\\movies\\movies.txt", true);
            fileWriter.write(movie.getTitle() + "\r\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
