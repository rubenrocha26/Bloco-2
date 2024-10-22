package org.example;

public class Exercicio_1 {
    //output double, input int
    public static double exercicio_1 (int n1, int n2, int n3,int p1,int p2,int p3){

        double result;

        if ((p1<=0) || (p2<=0) || (p3<=0)){
            result = Double.NaN;
        }
        else
            //calcular media ponderada
            result = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);

        return result;
    }
}
