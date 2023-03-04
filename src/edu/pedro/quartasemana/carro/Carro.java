package edu.pedro.quartasemana.carro;

public class Carro {

    //atributos
    String cor;
    String modelo;
    int capacidadeTanque;

    //construtores

    Carro(){};

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    };


    //gets e sets
    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void  setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }


    //metodos de regras de negocio
    public double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }


}
