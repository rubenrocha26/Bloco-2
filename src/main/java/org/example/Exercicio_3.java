package org.example;

public class Exercicio_3 {
    public static double exercicio_3 ( double x1, double y1, double x2, double y2){
        double distance;      // A (x1, y1) B (x2, y2)
        double x_value = Math.pow(x2 - x1, 2); //x2, x1 ,potencia
        double y_value = Math.pow(y2 - y1, 2);
        distance = Math.sqrt(x_value + y_value);
        return distance;
    }
}
