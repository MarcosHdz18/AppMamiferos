package com.dev.mark.appmamiferos.guepardo;

import com.dev.mark.appmamiferos.mamiferos.Felino;

public class Guepardo extends Felino {

    public Guepardo(String habitat, float altura, float largo, float peso, float tamanioGarras, int velocidad) {
        super(habitat, altura, largo, peso, tamanioGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo caza junto a su grupo en las llanuras africanas, con una mórdida mucho inferior a los demás felinos";
    }

    @Override
    public String dormir() {
        return "El guepardo duerme en las estepas africanas";
    }

    @Override
    public String correr() {
        return "El guepardo es el felino más rápido del mundo, corre a " + this.velocidad + "km/h";
    }

    @Override
    public String comunicarse() {
        return "El guepardo ruge no tn fuerte como el León";
    }
}
