package edu.pedro.quartasemana.emprestimo;

import java.util.Scanner;

public class funcao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculo calc = new Calculo();
        double x, y;

        System.out.println("por favor digite o valor que deseja emprestar");
        x = scan.nextDouble();

        System.out.println("por favor digite a quantidade de parcelas que deseja para efetuar o pagamento");
        y = scan.nextDouble();
        if (y >24){
            System.out.println(" só é possivel parcelar em até 24 vezes");
        }else {
            System.out.println(" o valor total a pagar pelo emprestimo será de "+calc.taxa(y,x));
        }
    }
}
