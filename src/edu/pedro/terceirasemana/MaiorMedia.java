package edu.pedro.terceirasemana;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int contador = 0;
        int maior = 0;
        int media = 0;

        do{
            System.out.println("Digite um numero");
            numero = scan.nextInt();

            if(maior<numero ){
                maior = numero;
            }
            contador++;
            media = media + numero;
        }while (contador<5);
          media = media/5;
        System.out.println("o maior numero digitado foi "+ maior+ " e a media é " + media);
    }
}
