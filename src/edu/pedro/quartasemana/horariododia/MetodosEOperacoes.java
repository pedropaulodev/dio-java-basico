package edu.pedro.quartasemana.horariododia;

public class MetodosEOperacoes {

    public  String VerificarDia(double horarioDoDia){

        if (horarioDoDia >=6 && horarioDoDia <= 12 ){
            return "Bom dia! ";

        } else if (horarioDoDia >12 && horarioDoDia <= 18) {
            return "Boa tarde! ";
        } else if (horarioDoDia >18 && horarioDoDia <= 24) {
            return "Boa noite! ";
        }else {
            return "Boa madrugada" ;
        }


    }

}
