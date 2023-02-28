package edu.pedro.quartasemana;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatoreos = new  int[20];

        for (int i = 0; i < numerosAleatoreos.length; i++){

            int numero = random.nextInt(100);
            numerosAleatoreos[i] = numero;
        }

        for ( int NumeroAleatoreo : numerosAleatoreos){

            System.out.print(NumeroAleatoreo+ " ");

        }
        System.out.println("\n");
        for (int NumeroAleatoreo : numerosAleatoreos){

            System.out.print(NumeroAleatoreo+1 +" ");
        }
    }
}
