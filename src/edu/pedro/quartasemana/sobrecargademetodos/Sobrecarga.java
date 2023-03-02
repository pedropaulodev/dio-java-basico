package edu.pedro.quartasemana.sobrecargademetodos;

public class Sobrecarga {

    public static void  area (double lado1, double lado2){
        System.out.println("area do retangulo: " + lado1*lado2);
    }

    public  static void  area( double baseMaior, double baseMenor, double altura){
        System.out.println("area do trapézio: "+((baseMaior+baseMenor)*altura)/2);
    }


}
