package edu.pedro.quintasemana.pooherança.polimorfismo;

public class RodarAplicacao {
    public static void main(String[] args) {
        //array do tipo pagamentos mãe que vai conter as outras classes filhas
        PagamentosMae[] classes = new PagamentosMae[]{new Pix(), new Credito(), new PagamentosMae()};

        // for que faz a iteração e exibe os metodos das classes que sofreram polimorfismo.
        for (PagamentosMae classe : classes) {
            classe.metodo1();
        }

    }
}
