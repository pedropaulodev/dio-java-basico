package edu.pedro.terceirasemana;

public class OperadoresRelacionaisLogicos {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;


        System.out.println((b1 && b2));
        System.out.println((b1 && b3));

        System.out.println((b2 || b3));
        System.out.println((b2 || b4));

        System.out.println((b1 ^ b3));
        System.out.println((b4 ^ b1));

        System.out.println(!b1);
        System.out.println(!b2);


        int i1 = 10;
        int i2 = 5;
        double d1 = 20;
        double d2 = 50;

        System.out.println(((i1 + i2) < (d2 - d1) && true));
        System.out.println(((11 > 12) || (d2 < d1)));





    }
}
