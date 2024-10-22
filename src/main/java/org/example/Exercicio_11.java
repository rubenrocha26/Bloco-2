package org.example;

public class Exercicio_11 {
    public static String exercicio_11 (double poluicao){

        if(poluicao<=0.3){
            return " ";
        }

        else if (poluicao<0.4){
            return "Grupo 1 atenção à poluição!";
        }
        else if (poluicao<0.5){
            return "Grupo 1 e 2 atenção à poluição!";
        }
        return "Grupo 1, 2 e 3 devem suspender as atividades!";
    }
}
