package edu.pedro.quartasemana.horariododia;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MetodosEOperacoes dia = new MetodosEOperacoes();

        double l = 0;
        System.out.println("por favor digite o horario atual");
        l = scan.nextDouble();
        System.out.println(dia.VerificarDia(l));


    }

}
