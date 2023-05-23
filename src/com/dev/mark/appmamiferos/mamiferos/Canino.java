package com.dev.mark.appmamiferos.mamiferos;

public abstract class Canino extends Mamifero {

    protected String color;
    protected float tamanioColmillos;

    public Canino(String habitat, float altura, float largo, float peso, String color, float tamanioColmillos) {
        super(habitat, altura, largo, peso);
        this.color = color;
        this.tamanioColmillos = tamanioColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamanioColmillos() {
        return tamanioColmillos;
    }
}


