package org.example;

public class Exercicio_12 {

    public static String exercicio_12 (int area, int numTree, int numBushes) {

        if (area < 0 || numTree < 0 || numBushes < 0) {
            return "0";
        }

        int grassTime = 300 * area;
        int treeTime = 600 * numTree;
        int bushTime = 400 * numBushes;
        int totalTimeSeconds = (grassTime+treeTime+bushTime); //int para ser passado para horas
        int totalTimeHours = totalTimeSeconds/3600; //Converte Segundos em Horas

        int grassPrice = 10 * area;
        int treePrice = 20 * numTree;
        int bushPrice = 15 * numBushes;
        int workPrice = 10 * totalTimeHours;
        int totalPrice = grassPrice + treePrice + bushPrice + workPrice; //Preço Total

        if(totalTimeHours==0 && totalPrice >0){
            totalTimeHours=1;
        }

        return "O tempo total é:" + totalTimeHours + " e o custo total é: " + totalPrice;
    }
}
