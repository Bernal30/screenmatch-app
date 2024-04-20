package com.empresa.screenmatch.modelos;

import com.empresa.screenmatch.calculos.Classification;

//clase modelo para el objeto MOVIE
//extends hace que está clase herede todos los atributos y métodos de title
//se implementa la plantilla Classification
public class Movie extends Title implements Classification {
    String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    //se adapta método getClassification() de la interfaz
    @Override
    public int getClassification() {
        return (int) (calculationMean() / 2);
    }
}
