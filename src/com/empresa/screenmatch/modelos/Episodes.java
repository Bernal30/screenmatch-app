package com.empresa.screenmatch.modelos;

import com.empresa.screenmatch.calculos.Classification;

public class Episodes implements Classification {
    private int numberOfEpisode;
    private String name;
    private Serie serie;
    private int totalLikes;

    public int getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public int getNumberOfEpisode() {
        return numberOfEpisode;
    }

    public void setNumberOfEpisode(int numberOfEpisode) {
        this.numberOfEpisode = numberOfEpisode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassification() {
        if (totalLikes > 500) {
            return 4;
        } else {
            return 2;
        }
    }
}
