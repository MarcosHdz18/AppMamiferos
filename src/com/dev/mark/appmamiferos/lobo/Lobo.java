package com.dev.mark.appmamiferos.lobo;

import com.dev.mark.appmamiferos.mamiferos.Canino;

public class Lobo extends Canino {

    private int numeroCamada;
    private String especieLobo;

    public Lobo(int numeroCamada, String especieLobo, String habitat, float altura, float largo, float peso, String color, float tamanioColmillos) {
        super(habitat, altura, largo, peso, color, tamanioColmillos);
        this.numeroCamada = numeroCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumeroCamada() {
        return numeroCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo " + this.especieLobo + " caza junto a su grupo de " + this.numeroCamada + " individuos en los bosques de " + this.habitat;
    }

    @Override
    public String dormir() {
        return "El lobo " + this.especieLobo + " duerme en las llanuras aledañas a los bosques de " + this.habitat;
    }

    @Override
    public String correr() {
        return "El lobo " + this.especieLobo + " corre en las llanuras aledañas a los bosques de " + this.habitat;
    }

    @Override
    public String comunicarse() {
        return "El lobo " + this.especieLobo + " " + this.color + " aulla en la luna llena";
    }
}
