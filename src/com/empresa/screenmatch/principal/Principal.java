package com.empresa.screenmatch.principal;

//se importan las clases del package
import com.empresa.screenmatch.calculos.CalculadoraDeTiempo;
import com.empresa.screenmatch.calculos.RecommendationFilter;
import com.empresa.screenmatch.modelos.Episodes;
import com.empresa.screenmatch.modelos.Movie;
import com.empresa.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //instancia del constructor Movie(); para un nuevo objeto llamado "myMovie"
        //Movie al inicio es la variable de referencia para el tipo de dato
        Movie myMovie = new Movie("Fight Club", 1999);
        //declaramos atributos del objeto
        myMovie.setMinutesLong(126);
        myMovie.setAddedInPlan(true);
        myMovie.setDirector("David Fincher");

        //se muestra en pantalla la ficha tecnida de la pelicula
        myMovie.showsTechnicalSheet();

        //tres ratings para la pelicula Fight Club
        myMovie.ratingTitle(9.2);
        myMovie.ratingTitle(10);
        myMovie.ratingTitle(8.9);

        //se muestra el calculo de la media de los ratings
        myMovie.showsCalculationMean();

        //se emplea el get para visualizar la variable privada metacriticRatingMyMovie
        System.out.println("El rating de Metacritic es de " + myMovie.getMetacriticRatingMyMovie());

        //mediante un get se llama al valor (boolean) de la variable addedInPlan
        if (myMovie.isAddedInPlan()) {
            System.out.println("La pelicula si esta incliuda en su plan actual.");
        } else {
            System.out.println("La pelicula no esta incluida en su plan actual.");
        }

        //se declara un nuevo obj serie con sus atributos
        Serie chernobylSerie = new Serie("Chernobyl", 2020);
        chernobylSerie.setSeasons(1);
        chernobylSerie.setEpisodesEachSeason(5);
        chernobylSerie.setMinutesEachEpisode(60);
        //se muestra la ficha tecnica de la serie
        chernobylSerie.showsTechnicalSheet();
        //calculo de minutos totales para ver toda la serie
        System.out.println("\nLos minutos totales para ver la serie copmpleta son: " + chernobylSerie.getMinutesLong());


        //SEGUNDA PELICULA
        Movie anotherMovie = new Movie("Lego Movie", 2016);
        anotherMovie.setMinutesLong(116);
        //se muestra la ficha tecnica
        anotherMovie.showsTechnicalSheet();

        anotherMovie.ratingTitle(8.1);
        anotherMovie.ratingTitle(9);
        anotherMovie.ratingTitle(7.9);
        //calculo de media de ratings
        anotherMovie.showsCalculationMean();

        //nuevo obj de la clase Movie
        Movie anotherMovie2 = new Movie("Soul", 2020);
        anotherMovie2.setMinutesLong(100);
        anotherMovie2.showsTechnicalSheet();

        //nuevo obj de la clase Serie
        Serie anotherSerie = new Serie("Smiling Firends", 2020);
        anotherSerie.setSeasons(1);
        anotherSerie.setEpisodesEachSeason(9);
        anotherSerie.setMinutesEachEpisode(10);
        anotherSerie.showsTechnicalSheet();
        System.out.println("El tiempo para ver " + anotherSerie.getName() + " completo es: " + anotherSerie.getMinutesLong() + " minutos");


        //nuevo obj "calculator" de la clase CalculadoraDeTiempo
        CalculadoraDeTiempo calculator = new CalculadoraDeTiempo();
        //calculo de minutos totales de todos los titulos (series y peliculas)
        calculator.addingTitles(myMovie);
        calculator.addingTitles(chernobylSerie);
        calculator.addingTitles(anotherMovie);
        calculator.addingTitles(anotherMovie2);
        calculator.addingTitles(anotherSerie);

        //se muestran los minutos totales
        System.out.println("\nEl tiempo total para ver estos titulos es: " + calculator.getTotalTime() + " minutos");

        //filtro de recomendaciones para la pelicula y un capitulo
        RecommendationFilter recommendationFilter = new RecommendationFilter();


        //resultado del filtro de la peilicula "Fight Club" (myMovie)
        System.out.println("\nPara la pelicula Figth Club: " + recommendationFilter.toFilter(myMovie));

        //creando obj Episode
        Episodes episode = new Episodes();
        episode.setName("El gran día de Desmond");
        episode.setNumberOfEpisode(1);
        episode.setSerie(anotherSerie);
        episode.setTotalLikes(1508);

        //aplicando el filtro de recomendaciones al obj "episode"
        System.out.println("Para este episodio: " + recommendationFilter.toFilter(episode));

        //la declaración var no hace instancia del tipo de dato
        var anotherMovie3 = new Movie("Blade Runner 2049", 2017);
        anotherMovie3.setMinutesLong(163);
        anotherMovie3.setDirector("Denis Villeneuve");

        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(anotherMovie3);
        moviesList.add(myMovie);
        moviesList.add(anotherMovie);
        moviesList.add(anotherMovie2);

        //tamaño del array
        System.out.println("\nTamaño de la lista: " + moviesList.size());

        //se obtien el primer objeto del array y de ese objeto se obtiene su nombre
        System.out.println("La primera pelicula es: " + moviesList.get(0).getName());

        //se obtine el ultimo objeto del array y de ese objeto se obtiene su nombre
        System.out.println("La ultima pelicula de la lista es: " + moviesList.get(moviesList.size() - 1).getName());

        System.out.println(moviesList);

        System.out.println("toString de la primer pelicula de la lista: " + moviesList.get(0).toString());
    }
}
