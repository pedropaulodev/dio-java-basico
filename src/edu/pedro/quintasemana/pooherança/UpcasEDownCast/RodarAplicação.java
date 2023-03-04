package edu.pedro.quintasemana.pooherança.UpcasEDownCast;

public class RodarAplicação {
    public static void main(String[] args) {

    //primeiro instanciamos um objto da classe mãe
        Funcionario funcionario = new Funcionario();

    // depois fazemos o upcast chamando a classe mae, guardando em uma varavel e chamando a classe sofrera o Upcast.
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

    //ja os downcast precisamos especificar quem sofrera o downcast

      //  Vendedor vendedor = (Vendedor) new Funcionario();

    }
}
