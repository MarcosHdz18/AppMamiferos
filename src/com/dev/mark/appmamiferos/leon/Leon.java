package com.dev.mark.appmamiferos.leon;

import com.dev.mark.appmamiferos.mamiferos.Felino;

public class Leon extends Felino {

    private int numeroManada;
    private double potenciaRugidoDecibel;

    public Leon(double potenciaRugidoDecibel, int numeroManada, String habitat, float altura, float largo, float peso, float tamanioGarras, int velocidad) {
        super(habitat, altura, largo, peso, tamanioGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumeroManada() {
        return numeroManada;
    }

    public double getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El león caza junto a su grupo de " + this.numeroManada + " individuos en las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El león duerme en las estepas africanas";
    }

    @Override
    public String correr() {
        return "El león corre a " + this.velocidad + " km/h";
    }

    @Override
    public String comunicarse() {
            return "El león ruge fuerte a " + this.potenciaRugidoDecibel + " decibelios";
    }
}
