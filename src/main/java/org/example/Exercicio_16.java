package org.example;

public class Exercicio_16 {
    public static String exercicio_16(int horasPartida, int minutosPartida, int horasViagem, int minutosViagem) {

        if (horasPartida < 0 || minutosPartida <0 || horasViagem < 0 || minutosViagem < 0) {
            return "error";
        }

        if (horasPartida > 24 || minutosPartida > 60 || horasViagem>24 || minutosViagem > 60) {
            return "error";
        }

        int tempoTotalViagemMinutos = horasViagem*60 + minutosViagem;
        if (tempoTotalViagemMinutos > 1440) {
            return "error";
        }

        int tempoTotalMinutos = (horasPartida*60) + (minutosPartida) + tempoTotalViagemMinutos;

        int horasChegada = (tempoTotalMinutos/60) % 24;
        int minutosChegada = (tempoTotalMinutos % 60);


        return horasChegada + ":" + minutosChegada;

    }
}
