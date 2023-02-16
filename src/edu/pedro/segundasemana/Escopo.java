package edu.pedro.segundasemana;

public class Escopo {

    double saldo = 10.0;
    //disponivel em toda a classe

    public void sacar(double valor){

        double novoSaldo = saldo - valor;
            // só dentro do metodo
    }

    public  void imprimirSaldo(){

        System.out.println(saldo);

    }
   //ainda temos as variaveis disponiveis dentro de escopos de fluxos de codigo, por exemplo uma condicional

}
