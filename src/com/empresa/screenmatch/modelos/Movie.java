package com.empresa.screenmatch.modelos;

import com.empresa.screenmatch.calculos.Classification;

//clase modelo para el objeto MOVIE
//extends hace que está clase herede todos los atributos y métodos de title
public class Movie extends Title implements Classification {
    String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) (calculationMean() / 2);
    }
}
