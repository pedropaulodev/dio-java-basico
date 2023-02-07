package edu.pedro.segundasemana;

public class Operadores {
    public static void main(String[] args) {

        int numeroTexte = 5;
//      converte para negativo
        numeroTexte = - numeroTexte;

        System.out.println(numeroTexte);
//      converte para positivo
        numeroTexte =  numeroTexte * -1;
        System.out.println(numeroTexte);

//      operadores de incremento ++ e --
        numeroTexte ++;
        System.out.println(numeroTexte);

        numeroTexte --;
        System.out.println(numeroTexte);

        boolean boleana = true;

        System.out.println(!boleana);


        int a = 5;
        int b = 7;
        String resultado =  a==b ?"verdadeiro" : "falso";

        System.out.println(resultado);


    }


}
