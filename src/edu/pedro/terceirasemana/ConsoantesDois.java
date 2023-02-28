package edu.pedro.terceirasemana;

import java.util.Scanner;

public class ConsoantesDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] consoantes = new String[6];

        int quantidadeConsoante = 0;
        int cont = 0;

        do {
            System.out.println("letra: ");
            String letra = scan.next();

            //utilizamos o ! para invertermos, ou seja ele vai executar o bloco de codigo quando não estas letras não forem digitadas
            if ( ! (letra.equalsIgnoreCase("a")|
                    letra.equalsIgnoreCase("e")|
                    letra.equalsIgnoreCase("i")|
                    letra.equalsIgnoreCase("o")|
                    letra.equalsIgnoreCase("u"))
            ){
                consoantes[cont] = letra;
                quantidadeConsoante++;
            }
        cont++;

        }while (cont < consoantes.length);

        for (String consoante : consoantes){
            System.out.print(consoante + " " );
        }

    }
}
