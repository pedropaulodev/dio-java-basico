package edu.pedro.terceirasemana;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

                //expressão que recebera true se for satisfeita.
        while (nota < 0 | nota > 10) {
            System.out.println("nota invalida");
            nota = scan.nextInt();
        }
    }
}
