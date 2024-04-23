package com.empresa.screenmatch.modelos;

//clase para el obj SERIES
//hereda los atributos y metodos de la clase title
public class Serie extends Title {
    int seasons;
    int episodesEachSeason;
    int minutesEachEpisode;

    public Serie(String name, int dateRelease) {
        //se llama al constructor de la clase madre Title
        super(name, dateRelease);
    }

    //@Overrite se usa para sobre escribir un metodo de la super clase para comportamientos especificos en la subclase
    @Override
    //metodo sobre escrito en el metodo getMinutesLong() para dos clases de objetos diferentes
    public int getMinutesLong() {
        return seasons * episodesEachSeason * minutesEachEpisode;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesEachSeason() {
        return episodesEachSeason;
    }

    public void setEpisodesEachSeason(int episodesEachSeason) {
        this.episodesEachSeason = episodesEachSeason;
    }

    public int getMinutesEachEpisode() {
        return minutesEachEpisode;
    }

    public void setMinutesEachEpisode(int minutesEachEpisode) {
        this.minutesEachEpisode = minutesEachEpisode;
    }

    //sobre escribimos el metodo to String de la super clase Object
    @Override
    public String toString() {
        return " " + this.getName() + " (" + this.getDateRelease() + ")";
    }
}
