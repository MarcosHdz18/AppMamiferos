package com.dev.mark.appmamiferos;

import com.dev.mark.appmamiferos.guepardo.Guepardo;
import com.dev.mark.appmamiferos.leon.Leon;
import com.dev.mark.appmamiferos.lobo.Lobo;
import com.dev.mark.appmamiferos.mamiferos.Canino;
import com.dev.mark.appmamiferos.mamiferos.Felino;
import com.dev.mark.appmamiferos.mamiferos.Mamifero;
import com.dev.mark.appmamiferos.perro.Perro;
import com.dev.mark.appmamiferos.tigre.Tigre;

public class SistemaZoologicoMamiferos {
    public static void main(String[] args) {
        // Instancias de la clase Mamifero
        Mamifero[] mamiferos = new Mamifero[6];

        Mamifero leon = new Leon(120d, 5, "Sur de África", 120, 220, 190, 58, 7);
        Mamifero tigre = new Tigre("Siberiano", "Rusia", 130, 330, 300, 72, 8);
        Mamifero lobo = new Lobo(5, "Ibérico", "Europa", 80, 120, 80, "Gris Marrón", 50);
        Mamifero perro = new Perro(317, "África", 43, 92, 30, "Tricolor de manchas negras con blancas", 34);

        Mamifero tigreBengala = new Tigre("Bengala", "Rusia", 100, 300, 280, 56, 10);
        Mamifero guepardo = new Guepardo("África", 96, 140, 98, 15,9);

        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = lobo;
        mamiferos[3] = perro;
        mamiferos[4] = tigreBengala;
        mamiferos[5] = guepardo;

        // Recorremos el arreglo
        for (Mamifero animal: mamiferos) {
            System.out.println("===================================== " + animal.getClass().getSimpleName() + "=====================================");
            System.out.println("Hábitat: " + animal.getHabitat());
            System.out.println("Altura: " + animal.getAltura());
            System.out.println("Largo: " + animal.getLargo());
            System.out.println("Peso: " + animal.getPeso());

            if (animal instanceof Canino) {
                System.out.println("Colmillos: " + ((Canino) animal).getTamanioColmillos());
                System.out.println("Color: " + ((Canino) animal).getColor());

                if (animal instanceof Lobo) {
                    System.out.println("Especie de Lobo: " + ((Lobo) animal).getEspecieLobo());
                    System.out.println("Integrantes de manada: " + ((Lobo) animal).getNumeroCamada());
                }

                if (animal instanceof Perro) {
                    System.out.println("Fuerza de mórdida: " + ((Perro) animal).getFuerzaMordida());
                }
            }

            if (animal instanceof Felino) {
                System.out.println("Tamaño de garras: " + ((Felino) animal).getTamanioGarras());
                System.out.println("Velocidad: " + ((Felino) animal).getVelocidad());

                if (animal instanceof Leon) {
                    System.out.println("Potencia de rugido: " + ((Leon) animal).getPotenciaRugidoDecibel());
                    System.out.println("Número de manada: " + ((Leon) animal).getNumeroManada());
                }

                if (animal instanceof Tigre) {
                    System.out.println("Especie: " + ((Tigre) animal).getEspecieTigre());
                }
            }
            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
        }

    }
}
