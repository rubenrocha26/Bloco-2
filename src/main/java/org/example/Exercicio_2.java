package org.example;

public class Exercicio_2 {
    public static String exercicio_2 (int number){

        if (number <100 || number >999) {
            return "3";
        }
        else {
            int d3 = number % 10;       //isolar numero de posição 3
            int d2 = (number / 10) % 10;   //isolar numero de posição 2
            int d1 = (number / 100) % 10;   //isolar numero de posição 1
            return d1 + " " + d2 + " " + d3;
        }
    }
}
