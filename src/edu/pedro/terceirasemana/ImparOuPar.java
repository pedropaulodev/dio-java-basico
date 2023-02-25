package edu.pedro.terceirasemana;

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numeros;
        int par = 0;
        int impar = 0;

        System.out.println("Digite a quantidade de numeros que você deseja digitar: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("digite o numero");
            numeros = scan.nextInt();
            if (numeros % 2 == 0){
                par++;
            }else{
                impar++;
            }

            quantNumeros--;
        }while (quantNumeros > 0);

        System.out.println("A quantidades de numeros pares digitados é: "+par+" e a quantidade de numeros impares digitados é: "+impar);



    }
}
