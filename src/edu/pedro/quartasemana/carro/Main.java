package edu.pedro.quartasemana.carro;

public class Main {
    public static void main(String[] args) {
        //criando objetos 1
        Carro carro1 = new Carro();
        //setando os valores nos atributos nos metodos set
        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        //exibindo os valores com o metodo get
        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.46));
        System.out.println("\n");

        //criando objetos 2 e setando os valores passando como parametro diretamente na criação do objeto.
        Carro carro2 = new Carro("Cinza","mercedes",66);
        //exibindo os valores utilizando os metodos get
        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));

    }
}
