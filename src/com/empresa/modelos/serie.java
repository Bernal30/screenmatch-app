package com.empresa.modelos;

//clase para el obj SERIES
//hereda los atributos y metodos de la clase title
public class serie extends title{
    int seasons;
    int episodesEachSeason;
    int minutesEachEpisode;

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
}
