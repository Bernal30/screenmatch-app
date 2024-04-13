package com.empresa.modelos;

//clase modelo para el objeto MOVIE
public class movie {
    private String name;
    private int dateRelease;
    private int minutesLong;
    private boolean addedInPlan;
    double ratingSum;
    int totalRatings;
    //modificador de acceso private para que no se pueda acceder a el desde fuera de la clase
    private double metacriticRatingMyMovie = 9.8;

    //setters para las variables privadas

    public void setName(String name) {
        this.name = name;
    }

    public void setDateRelease(int dateRelease) {
        this.dateRelease = dateRelease;
    }

    public void setMinutesLong(int minutesLong) {
        this.minutesLong = minutesLong;
    }

    public void setAddedInPlan(boolean addedInPlan) {
        this.addedInPlan = addedInPlan;
    }

    //getter para la variable privada addedInPlan
    public boolean isAddedInPlan() {
        return addedInPlan;
    }

    //acceso de visibilidad fuera de la clase com.empresa.modelos.movie a la variable con el método getMetacriticRatingMyMovie()
    public double getMetacriticRatingMyMovie() {
        return metacriticRatingMyMovie;
    }


    //void hace que el metodo showsTechnicalSheet() no retorne nada
    public void showsTechnicalSheet() {
        //mensaje en pantalla de la ficha tecnica de la pelicula
        System.out.println("\nEl nombre de la pelicula es " + name);
        System.out.println("Fecha de lanzamiento: " + dateRelease);
        System.out.println("Duración en minutos: " + minutesLong);
    }

    public void ratingMovie(double rate) {
        ratingSum += rate;
        totalRatings++;
    }

    //este método retorna un double se útiliza return
    public double calculationMean() {
        return ratingSum / totalRatings;
    }

    public void showsCalculationMean() {
        System.out.println("El total de las evaluaciones es: " + totalRatings);
        System.out.println("la media de los ratings es: " + calculationMean());
    }
}
