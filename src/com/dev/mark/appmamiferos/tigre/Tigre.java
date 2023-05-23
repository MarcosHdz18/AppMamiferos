package com.dev.mark.appmamiferos.tigre;

import com.dev.mark.appmamiferos.mamiferos.Felino;

public class Tigre extends Felino {

    private String especieTigre;

    public Tigre(String especieTigre, String habitat, float altura, float largo, float peso, float tamanioGarras, int velocidad) {
        super(habitat, altura, largo, peso, tamanioGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre " + this.especieTigre + " caza solitario en los manglares y bosques amazónicos de " + this.habitat;
    }

    @Override
    public String dormir() {
        return "El tigre " + this.especieTigre + " duerme en las selvas de " + this.habitat;
    }

    @Override
    public String correr() {
        return "El tigre " + this.especieTigre + " correr a " + this.velocidad + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El tigre ruge y agacha sus orejas";
    }
}
