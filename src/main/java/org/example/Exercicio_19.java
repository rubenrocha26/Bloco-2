package org.example;

public class Exercicio_19 {

    public static String exercicio_19 ( char tipoKit, String diaSemana, int distanciaKm) {

        String precoAluguer = "";

        if ((tipoKit != 'A') && (tipoKit != 'B') && (tipoKit != 'C')) {
            return "Invalid Kit";  //Se o input não for nenhum dos kits possiveis
        }
        if ((!diaSemana.equals("2º")) && (!diaSemana.equals("3º")) && (!diaSemana.equals("4º")) && (!diaSemana.equals("5º")) && (!diaSemana.equals("6º")) && (!diaSemana.equals("Sab")) && (!diaSemana.equals("Dom")) && (!diaSemana.equals("Feriado"))){
            return "Invalid Dia Semana"; // Se o input não for um dia da semana
        }

        if (distanciaKm<0){
            return "Invalid Distance";
        }

        int precoEntrega = 2*distanciaKm;


        if (tipoKit == 'A') { //Se o kit for A
            if ((diaSemana.equals("2º")) || (diaSemana.equals("3º")) || (diaSemana.equals("4º")) || (diaSemana.equals("5º")) || (diaSemana.equals("6º"))){
                 precoAluguer = "30 euros";
            }else{
                precoAluguer = "40 euros";
            }
        }
        else if (tipoKit == 'B'){ //Se o kit for B
            if ((diaSemana.equals("2º")) || (diaSemana.equals("3º")) || (diaSemana.equals("4º")) || (diaSemana.equals("5º")) || (diaSemana.equals("6º"))){
                precoAluguer = "50 euros";
            }else{
                precoAluguer = "70 euros";
            }
            }
        else if (tipoKit=='C') { //Se o kit for C
                if ((diaSemana.equals("2º")) || (diaSemana.equals("3º")) || (diaSemana.equals("4º")) || (diaSemana.equals("5º")) || (diaSemana.equals("6º"))) {
                    precoAluguer = "100 euros";
                } else {
                    precoAluguer = "140 euros";
                }
        }
        return precoAluguer + " + " + precoEntrega + " euros da entrega";
    }
}
