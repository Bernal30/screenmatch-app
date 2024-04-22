package com.empresa.screenmatch.principal;

import com.empresa.screenmatch.modelos.Movie;
import com.empresa.screenmatch.modelos.Serie;
import com.empresa.screenmatch.modelos.Title;

import java.util.ArrayList;

public class PrincipalWithArray {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Fight Club", 1999);
        myMovie.ratingTitle(9.8);
        Movie anotherMovie = new Movie("Lego Movie", 2016);
        anotherMovie.ratingTitle(9.1);
        Movie anotherMovie2 = new Movie("Soul", 2020);
        anotherMovie2.ratingTitle(8.9);
        var anotherMovie3 = new Movie("Blade Runner 2049", 2017);
        anotherMovie3.ratingTitle(8.7);

        Serie chernobylSerie = new Serie("Chernobyl", 2020);
        chernobylSerie.ratingTitle(9.8);
        Serie anotherSerie = new Serie("Smiling Firends", 2020);
        anotherSerie.ratingTitle(9.8);

        //Array de objetos de la super clase Title
        ArrayList<Title> moviesList = new ArrayList<>();
        moviesList.add(anotherMovie3);
        moviesList.add(myMovie);
        moviesList.add(anotherMovie);
        moviesList.add(anotherMovie2);
        moviesList.add(chernobylSerie);
        moviesList.add(anotherSerie);

        //for each para iterar items de un array
        for (Title item: moviesList) {
            //para mostrar solo el nombre
            //System.out.println(item.getName());

            //println llama al toString del item
            System.out.println(item);

            //si la instancia del item es del tipo Movie y si la clasificación es mayor a 2
            if (item instanceof Movie movie && movie.getClassification() > 2) {
                System.out.println(movie.getClassification());
            }

        }
    }
}
