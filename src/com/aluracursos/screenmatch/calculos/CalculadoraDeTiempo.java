package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Pelicula;

public class CalculadoraDeTiempo {

    private int tiempoTotal;
    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Pelicula pelicula) {
        tiempoTotal += pelicula.getDuracionEnMinutos();
    }
}