package edu.pedro.terceirasemana;

import java.util.Scanner;

public class LoopsEArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade = 1;


        while (idade != 0) {

            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = scan.nextInt();

        }

        System.out.println("obrigado por utilizar nosso programa");

    }
}
