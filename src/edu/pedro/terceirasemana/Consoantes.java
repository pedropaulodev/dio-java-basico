package edu.pedro.terceirasemana;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//criando um vetor com 6 posições não preenchidas, e para isso nos precisamos criar o objeto pois
        // um array é um objeto
        String [] consoantes = new String[6];

        for (int i = 0; i < consoantes.length; i++){
            System.out.println("Por favor digite a sua "+(i+1)+"°"+ " consoante");
            consoantes[i] = scan.next();
            if (consoantes[i].equals("a") ||consoantes[i].equals("e")||consoantes[i].equals("i")||consoantes[i].equals("o") ||consoantes[i].equals("u") ){
                System.out.println("você não digitou uma consoante, por favor tente novamente");
                i--;
            }else {
                System.out.println("foram lidas " + (i + 1) + " consoante");
            }
        }
        System.out.println("as consoantes digitadas foram ");
        for (int cont = 0 ; cont<consoantes.length;cont++){
            System.out.print(consoantes[cont]+ " ");
        }

    }
}
