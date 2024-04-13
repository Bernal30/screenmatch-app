import com.empresa.modelos.movie;

public class principal {
    public static void main(String[] args) {
        //instancia de la clase modelo de MOVIE
        movie myMovie = new movie();
        //declaramos atributos del objeto
        myMovie.setName("Fight Club");
        myMovie.setDateRelease(1999);
        myMovie.setMinutesLong(126);
        myMovie.setAddedInPlan(true);

        //se muestra en pantalla la ficha tecnida de la pelicula
        myMovie.showsTechnicalSheet();

        //tres ratings para la pelicula Fight Club
        myMovie.ratingMovie(9.2);
        myMovie.ratingMovie(10);
        myMovie.ratingMovie(8.9);

        //se llama al metodo showsCalculationMean()
        myMovie.showsCalculationMean();

        //se emplea el get para visualizar la variable privada metacriticRatingMyMovie
        System.out.println("El rating de Metacritic es de " + myMovie.getMetacriticRatingMyMovie());

        //mediante un get se llama al valor de la variable addedInPlan
        if (myMovie.isAddedInPlan()) {
            System.out.println("La pelicula si esta incliuda en su plan actual.");
        } else {
            System.out.println("La pelicula no esta incluida en su plan actual.");
        }






        // SEGUNDA PELICULA
//        movie anotherMovie = new movie();
//        anotherMovie.name = "Lego Movie";
//        anotherMovie.dateRelease = 2016;
//        anotherMovie.minutesLong = 116;
//
//        anotherMovie.showsTechnicalSheet();
//
//        anotherMovie.ratingMovie(8.1);
//        anotherMovie.ratingMovie(9);
//        anotherMovie.ratingMovie(7.9);
//
//        anotherMovie.showsCalculationMean();

    }
}
