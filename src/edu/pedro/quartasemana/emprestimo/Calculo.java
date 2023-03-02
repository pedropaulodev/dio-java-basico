package edu.pedro.quartasemana.emprestimo;

public class Calculo {
    public  double taxa (double qtdParcelas, double valorEmprestimo){
        if(qtdParcelas <= 12){
            return valorEmprestimo;
        } else if (qtdParcelas > 12 && qtdParcelas <= 18) {
            return valorEmprestimo+(valorEmprestimo * 0.08);
        } else if ((qtdParcelas > 18 && qtdParcelas <= 24) ) {
            return valorEmprestimo+(valorEmprestimo * 0.15);
        }else {
            return  0;
        }
    }


}
