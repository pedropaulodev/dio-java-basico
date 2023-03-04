package edu.pedro.quintasemana.pooherança.polimorfismo;

public class Credito extends PagamentosMae{

    @Override
    void metodo1() {
        System.out.println("metodo 1 da classe filha 2");
    }

    @Override
    void metodo2() {
        System.out.println("metodo 2 da classe filha 2");
    }

}
