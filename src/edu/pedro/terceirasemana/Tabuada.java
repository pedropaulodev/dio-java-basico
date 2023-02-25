package edu.pedro.terceirasemana;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.println("Digite a tabuada que você deseja");
        tabuada = scan.nextInt();

        for (int contador = 1; contador<=10; contador++){

            System.out.println(tabuada+" x "+contador +"="+ (contador*tabuada));

        }

    }
}
