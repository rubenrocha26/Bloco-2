package org.example;

public class Exercicio_18 {

    public static double exercicio_18 (int horasTrabalho) {
        double precoHora = 7.5;
        double precoHoraExtra = 10;
        double precoHoraExtraExtra = 15;

        double salario;  // Variavel Salário para evitar mais do que um return


        if (horasTrabalho >= 0) {

            if (horasTrabalho >= 36) {
                int horasExtras = horasTrabalho - 35;

                if (horasExtras < 6) {  //Trabalho com horas extras
                    salario = (35 * precoHora) + (horasExtras * precoHoraExtra);
                }
                else {  //Trabalho com horas extraextra
                    salario = (35 * precoHora) + (5 * precoHoraExtra) + ((horasExtras - 5) * precoHoraExtraExtra);
                }
            }
            else {  // Trabalho sem horas extra
                salario = horasTrabalho * precoHora;
            }

        }
        else {
            salario = -1;
        }

        return salario;
    }
}
