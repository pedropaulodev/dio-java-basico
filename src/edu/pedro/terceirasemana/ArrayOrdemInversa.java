package edu.pedro.terceirasemana;

public class ArrayOrdemInversa {
    public static void main(String[] args) {
        //declaração do vetor, todo vetor inicia no 0, dessa forma o numero z é a posição 0 e o numero 5 esta na posição 1
        // dessa forma temos um array de 6 elementos
        int [] vetor = {7,-5,15,50,8,4};

        // a propriedade length retorna o tamanho do nosso vetor, ou seja, quantos elementos ele tem
        for (int i = 0; i < (vetor.length);i++){
            // usamos o contador para percorrer todos os elementos do vetor.
            System.out.print(vetor[i] + " ");

        }
        System.out.println("\n");
        int cont = 0;
        cont = vetor.length -1;
        //mostrando vetor na ordem contraria
        while (cont > -1){
            System.out.print(vetor[cont] + " ");
            cont--;
        }


    }
}
