package org.example;

public class Exercicio_5 {

    public static String exercicio_5 (double area) {

        if (area > 0.0) {
            double aresta = Math.sqrt(area / 6);
            double volume = Math.pow(aresta, 3);

            if (volume <= 1) {
                return "1 (pequeno)";
            }
            if (volume <= 2) {
                return "2 (médio)";
            }
            else return "3 (grande)";
        }
        return "-1";
    }
}
