package com.empresa.screenmatch.modelos;

public class Title implements Comparable<Title> {
    private String name;
    private int dateRelease;
    private int minutesLong;
    private boolean addedInPlan;
    double ratingSum;
    int totalRatings;
    //modificador de acceso private para que no se pueda acceder a el desde fuera de la clase
    private final double metacriticRatingMyMovie = 9.8;

    public Title(String name, int dateRelease) {
        this.name = name;
        this.dateRelease = dateRelease;
    }

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

    //getters para las variables privadas

    public String getName() {
        return name;
    }

    public int getDateRelease() {
        return dateRelease;
    }

    public int getMinutesLong() {
        return minutesLong;
    }

    //getter
    public boolean isAddedInPlan() {
        return addedInPlan;
    }

    //acceso de visibilidad a la variable fuera de la clase Movie con el método getMetacriticRatingMyMovie()
    public double getMetacriticRatingMyMovie() {
        return metacriticRatingMyMovie;
    }


    //void hace que el metodo showsTechnicalSheet() no retorne nada
    public void showsTechnicalSheet() {
        //mensaje en pantalla de la ficha tecnica de la pelicula
        System.out.println("\nEl nombre del titulo es " + name);
        System.out.println("Fecha de lanzamiento: " + dateRelease);
        System.out.println("Duración en minutos: " + getMinutesLong());
    }

    public void ratingTitle(double rate) {
        ratingSum += rate;
        totalRatings++;
    }

    //este método retorna un double mediante un return
    public double calculationMean() {
        return ratingSum / totalRatings;
    }

    public void showsCalculationMean() {
        System.out.println("\nEl total de las evaluaciones es: " + totalRatings);
        System.out.println("la media de los ratings es: " + calculationMean());
    }

    //sobre escribimos el metodo comparaTo de la interfaz
    @Override
    public int compareTo(Title anotherTitle) {
        //obtenemos los nombres de los objetos Title e implementamos el compareTo ya que este solo se puede usar en Strings
        return this.getName().compareTo(anotherTitle.getName());
    }
}
