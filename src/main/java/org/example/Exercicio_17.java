package org.example;

public class Exercicio_17 {
    public static String exercicio_17(int horaInicioProcessamento, int minutoInicioProcessamento, int segundoIncioProcessamento, int duracaoProcessamentoSegundos){

        if (horaInicioProcessamento<0 || minutoInicioProcessamento<0 || segundoIncioProcessamento<0 || duracaoProcessamentoSegundos<0){  //Limitar o input porque não existe tempo menor que 0
            return "error";
        }

        if (horaInicioProcessamento>24 || minutoInicioProcessamento>60 || segundoIncioProcessamento>60){   //Limitar o input para as horas corretas
            return "error";
        }

        int inicioProcessamentoSegundos = (horaInicioProcessamento * 3600) + (minutoInicioProcessamento * 60) + segundoIncioProcessamento;  //Limitar o inicio de processamento em seugundos

        if (inicioProcessamentoSegundos >= 86401){
            return "error";
        }

        int tempoTotalSegundos = inicioProcessamentoSegundos + duracaoProcessamentoSegundos;

        int horaFinalProcessamento = (tempoTotalSegundos / 3600) % 24;
        int minutoFinalProcessamento = (tempoTotalSegundos % 3600) / 60;
        int segundoFinalProcessamento = (tempoTotalSegundos % 3600) % 60;

        return horaFinalProcessamento + ":" + minutoFinalProcessamento + ":" + segundoFinalProcessamento;
    }
}
