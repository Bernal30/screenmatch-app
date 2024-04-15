package com.empresa.screenmatch.modelos;

//clase modelo para el objeto MOVIE
//extends hace que está clase herede todos los atributos y métodos de title
public class Movie extends Title {
    String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
