package edu.pedro.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {

        String primeiroNome = "Claudisney";
        String segundoNome = "Sarapateu";

        String nomeCompleto = concatenaNomes(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);


    }
    //metodo com o retorno do tipo string.
    // obs metodos só podem ser criados fora do metodo main
    public static  String concatenaNomes (String primeiroNome, String segundoNome){

        return "resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
