//se declara el package calculos
package com.empresa.screenmatch.calculos;
//se importan los packages para las respectivas clases, metodos y atributos a utilizar
import com.empresa.screenmatch.modelos.Title;

public class CalculadoraDeTiempo {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    //se aplica el polimorfismo. Se llama a la clase Title para que se tomen en cuenta series y peliculas a la vez
    //el concepto de polimorfismo nos ayuda a redicur codigo al no llamar dos veces al metodo addingTitles()

    public void addingTitles(Title title) {
        System.out.println("\nAgregando duración en minutos de: " + title);
        this.totalTime += title.getMinutesLong();
    }

}
