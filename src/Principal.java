//se importan las clases del package
import com.empresa.screenmatch.calculos.CalculadoraDeTiempo;
import com.empresa.screenmatch.modelos.Movie;
import com.empresa.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        //instancia de la clase modelo de MOVIE, nuevo obj "myMovie"
        Movie myMovie = new Movie();
        //declaramos atributos del objeto
        myMovie.setName("Fight Club");
        myMovie.setDateRelease(1999);
        myMovie.setMinutesLong(126);
        myMovie.setAddedInPlan(true);
        myMovie.setDirector("David Fincher");

        //se muestra en pantalla la ficha tecnida de la pelicula
        myMovie.showsTechnicalSheet();

        //tres ratings para la pelicula Fight Club
        myMovie.ratingMovie(9.2);
        myMovie.ratingMovie(10);
        myMovie.ratingMovie(8.9);

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
        Serie chernobylSerie = new Serie();
        chernobylSerie.setName("Chernobyl");
        chernobylSerie.setDateRelease(2020);
        chernobylSerie.setSeasons(1);
        chernobylSerie.setEpisodesEachSeason(5);
        chernobylSerie.setMinutesEachEpisode(60);
        //se muestra la ficha tecnica de la serie
        chernobylSerie.showsTechnicalSheet();
        //calculo de minutos totales para ver toda la serie
        System.out.println("\nLos minutos totales para ver la serie copmpleta son: " + chernobylSerie.getMinutesLong());


        //SEGUNDA PELICULA
        Movie anotherMovie = new Movie();
        anotherMovie.setName("Lego Movie");
        anotherMovie.setDateRelease(2016);
        anotherMovie.setMinutesLong(116);
        //se muestra la ficha tecnica
        anotherMovie.showsTechnicalSheet();

        anotherMovie.ratingMovie(8.1);
        anotherMovie.ratingMovie(9);
        anotherMovie.ratingMovie(7.9);
        //calculo de media de ratings
        anotherMovie.showsCalculationMean();

        //nuevo obj de la clase Movie
        Movie anotherMovie2 = new Movie();
        anotherMovie2.setName("Soul");
        anotherMovie2.setDateRelease(2020);
        anotherMovie2.setMinutesLong(100);
        anotherMovie2.showsTechnicalSheet();

        //nuevo obj de la clase Serie
        Serie anotherSerie = new Serie();
        anotherSerie.setName("Smilling Firends");
        anotherSerie.setDateRelease(2020);
        anotherSerie.setSeasons(1);
        anotherSerie.setEpisodesEachSeason(9);
        anotherSerie.setMinutesEachEpisode(10);
        anotherSerie.showsTechnicalSheet();
        System.out.println("El tiempo para ver el titulo completo es: " + anotherSerie.getMinutesLong() + " minutos");


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

    }
}
