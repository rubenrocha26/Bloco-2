package org.example;

import java.util.Arrays;
import java.util.List;

public class Exercicio_19_2 {

    public static String exercicio_19_2(char tipoKit, String diaSemana) {
        //KIT A
        String kitAWeek = "30 euros";
        String kitAWeekend = "40 euros";
        //KIT B
        String kitBWeek = "50 euros";
        String kitBWeekend = "70 euros";
        //KIT C
        String kitCWeek = "100 euros";
        String kitCWeekend = "140 euros";

        // Lista de dias úteis e lista de kits válidos
        List<String> diasUteis = Arrays.asList("2º", "3º", "4º", "5º", "6º");
        List<Character> kitsValidos = Arrays.asList('A', 'B', 'C');

        // Verifica se o kit é válido
        if (!kitsValidos.contains(tipoKit)) {
            return "Invalid Kit";
        }

        // Verifica se o dia da semana é válido
        if (!diasUteis.contains(diaSemana) && !diaSemana.equals("Sab") && !diaSemana.equals("Dom") && !diaSemana.equals("Feriado")) {
            return "Invalid Dia Semana";
        }

        return kitAWeek;

    }
}
