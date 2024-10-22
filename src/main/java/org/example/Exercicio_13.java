package org.example;

public class Exercicio_13 {
    public static double exercicio_13 (int d1, int d2, int d3, int d4, int d5) {
        double distanciaTotalMilhas = (d1 + d2 + d3 + d4 + d5);
        if (distanciaTotalMilhas <=0) return Double.NaN;

        double distanciaMediaMilhas = distanciaTotalMilhas / 5;
        double distanciaMediaMetros = distanciaMediaMilhas * 1609;   //converte milhas em metros
        double distanciaMediaKm = distanciaMediaMetros/1000;  //converte metros em KM

        return distanciaMediaKm;
    }
}
