package edu.pedro.segundasemana;

import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {
        //criando objeto da classe Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scan.next();

        System.out.println("digite seu sobrenome");
        String sobrenome = scan.next();

        System.out.println("digite sua idade");
        int idade = scan.nextInt();

        System.out.println("digite sua altura");
        int altura = scan.nextInt();
        // cria variavel atribui a ela o imput que recebe como parametro um tipo inteiro


        System.out.println("meu nome é"+nome);
        System.out.println("meu sobrenome é "+sobrenome);
        System.out.println("tenho"+idade+"anos");
        System.out.println("minha altura é "+altura);
    }
}
