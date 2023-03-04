package edu.pedro.quintasemana.pooherança.Interfaces;
                         // usamos o implementes junto do nome da classe implementadora
public class Calculadora implements OperacaoMatematica {

    //o hava ja faz a subscrição automaticamente
    @Override
    public void soma(double operando1, double operando2) {
        System.out.println(operando1 + operando2);
    }

    @Override
    public void subtracao(double operando1, double operando2) {
        System.out.println(operando1 - operando2);
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {
        System.out.println(operando1 * operando2);
    }

    @Override
    public void divisao(double operando1, double operando2) {
        System.out.println(operando1 / operando2);
    }
}
