package org.example;

public class Exercicio_10 {
    public static double exercicio_10(double price){
        if (price <= 0){
            return 0;
        }
        double priceDiscount20 = price * 0.80; //preço com desconto de 20%
        double priceDiscount30 = price * 0.70; //preço com desconto de 30%
        double priceDiscount40 = price * 0.60; //preço com desconto de 40%
        double priceDiscount60 = price * 0.40; //preço com desconto de 60%

        if (price<=50.0){
            return priceDiscount20;
        }
        else if (price<=100.0){
            return priceDiscount30;
        }
        else if (price<=200.0){
            return priceDiscount40;
        }
        return priceDiscount60;
    }
}
