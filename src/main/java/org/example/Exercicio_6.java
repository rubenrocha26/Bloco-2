package org.example;

public class Exercicio_6 {

    public static String exercicio_6(int seconds) {
        if (seconds <= 0 || seconds >= 86401) {
            return "0";
        }
        int secondsRemaining = seconds % 60;
        int minutes =  seconds / 60;  //modulo hours
        int minutesRemaining = minutes % 60;
        int hours = seconds /3600;   // inteiro divisao

        // Determinação da saudação baseada nas horas
        int segundosDoDia = seconds % 86400; // Ajuste para o intervalo de um dia
        int horasSaudacao = segundosDoDia / 3600;

        String saudacao;
        if (horasSaudacao >=6 && horasSaudacao <12) {
            saudacao = "Bom dia";
        }
        else if (horasSaudacao >=12 && horasSaudacao <20){
            saudacao = "Boa tarde";
        }
        else {
            saudacao = "Boa noite";
        }

        if (seconds == 1) return saudacao + ": " + "1 second";
        if (seconds < 60) return saudacao + ": " + seconds + " seconds";
        if (seconds == 60) return saudacao + ": " + "1 minute";

        if (seconds <3600){
            return saudacao + ": " + minutes + " minutes " + secondsRemaining + " seconds";
        }
        return saudacao + ": "+ hours + " hours " + minutesRemaining + " minutes " + secondsRemaining + " seconds";
    }
}
