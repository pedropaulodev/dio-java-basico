package edu.pedro.terceirasemana;

public class ControleDeFluxo {
    public static void main(String[] args) {

        switchNumero();
        switchSemana();

    }




    private static void switchSemana(){

        String dia = "terça";

        switch (dia){

            case "segunda":
                System.out.println(2);
            break;
            case "terça":
                System.out.println(3);
                break;
            case "quarta":
                System.out.println(4);
                break;
            case "quinta":
                System.out.println(5);
                break;
            case "sexta":
                System.out.println(6);
                break;
            case "sabado":
                System.out.println(7);
                break;
            case "domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("opção invalida");

        }

    }


    private static void switchNumero(){

    int numero = 4;

    switch (numero){

        case 1: //neste caso 1 2 3 estarão certos
        case 2:// podemos utilizar o swith delimitando um range de resposta tbm
        case 3:
            System.out.println("certo");
        case 4:
            System.out.println("errou");

    }

    }

}
