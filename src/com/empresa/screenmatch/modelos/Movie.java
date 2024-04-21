package com.empresa.screenmatch.modelos;

import com.empresa.screenmatch.calculos.Classification;

//clase modelo para el objeto MOVIE
//extends hace que está clase herede todos los atributos y métodos de Title
//se implementa la plantilla Classification (interfaz)
public class Movie extends Title implements Classification {
    String director;

    //Constructor de objetos Movie para recibir un parametro de tipo String
    public Movie(String name) {
        this.setName(name);
    }

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

    //sobre escribimos un método de la super clase Object
    //este método se extrapola a todos los objetos Movie hijos de la super clase Object
    @Override
    public String toString() {
        return " " + this.getName() + " (" + this.getDateRelease() + ")";
    }

}
