package com.dev.mark.appmamiferos.perro;

import com.dev.mark.appmamiferos.mamiferos.Canino;

public class Perro extends Canino {

    private int fuerzaMordida;

    public Perro(int fuerzaMordida, String habitat, float altura, float largo, float peso, String color, float tamanioColmillos) {
        super(habitat, altura, largo, peso, color, tamanioColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro africano caza en manada con una fuerte mórdida de " + this.fuerzaMordida + " PSI, posee fuertes mandíbulas y grandes orejas redondas";
    }

    @Override
    public String dormir() {
        return "El perro africano duerme en la sabana africana";
    }

    @Override
    public String correr() {
        return "El perro africano corre en las llanuras aledañas a la Sabana";
    }

    @Override
    public String comunicarse() {
        return "Los perros ladran de noche durante cacerías nocturnas";
    }
}
