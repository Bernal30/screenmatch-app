
//clase modelo para el objeto MOVIE
public class movie {
    String name;
    int dateRelease;
    int minutesLong;
    boolean addedInPlan;
    //modificasor de acceso private para que no pueda acceder a el desde fuera de la clase
    private double ratingSum;
    int totalRatings;

    //void hace que el metodo showsTechnicalSheet() no retorne nada
    void showsTechnicalSheet() {
        //mensaje en pantalla de la ficha tecnica de la pelicula
        System.out.println("\nEl nombre de la pelicula es " + name);
        System.out.println("Fecha de lanzamiento: " + dateRelease);
        System.out.println("Duración en minutos: " + minutesLong);
    }

    void ratingMovie(double rate) {
        ratingSum += rate;
        totalRatings++;
    }

    //este método retorna un double se útiliza return
    double calculationMean() {
        return ratingSum / totalRatings;
    }

    void showsCalculationMean() {
        System.out.println("La suma de las evaluaciones es: " + ratingSum);
        System.out.println("El total de las evaluaciones es: " + totalRatings);
        System.out.println("la media de los ratings es: " + calculationMean());
    }
}
