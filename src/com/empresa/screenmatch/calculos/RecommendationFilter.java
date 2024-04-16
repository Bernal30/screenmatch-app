package com.empresa.screenmatch.calculos;

public class RecommendationFilter {

    public String toFilter(Classification classification) {
        if (classification.getClassification() >= 4) {
            return "valoraciones muy positivas.";
        } else if (classification.getClassification() >= 2){
            return "popular por el momento";
        } else {
            return "colocálo en tu lista para ver mas tarde.";
        }
    }
}
