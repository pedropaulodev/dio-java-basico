package edu.pedro.terceirasemana;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;
        int soma = 1;
        System.out.println("Digite o numero que deseja fatorar");
        fatorial = scan.nextInt();

        for (int contador = fatorial; contador >= 1;contador--){

           soma = soma *contador;

        }
        System.out.println("o resultado da fatoração é "+soma);
    }
}
