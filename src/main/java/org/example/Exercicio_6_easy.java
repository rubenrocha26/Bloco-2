package org.example;

public class Exercicio_6_easy {
    public static String exercicio_6_easy (int segundos){

        if (segundos <= 0 || segundos >= 86401) {
            return "0";
        }
        else {
            int horas = segundos / 3600;
            int minutos = (segundos % 3600) / 60;  // 1ª parte da minutos p.e. 66 (minuto real), para segundo igual a 3666
            int segundos_time = (segundos % 3600) % 60;

            return horas + ":" + minutos + ":" + segundos_time;
        }
    }
}
