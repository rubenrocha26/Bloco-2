package org.example;

public class Exercicio_9 {
    public static String exercicio_9(int number) {
        if (number <= 99 || number >999) {
            return "0";
        }
        int centenas = (number / 100) % 10;
        int dezenas = (number / 10) % 10;
        int unidades = number % 10;

        if (centenas<dezenas && dezenas<unidades){
            return "A sequência de algarismos é crescente";
        }
        return "A sequência de algarismos não é crescente";
    }
}
