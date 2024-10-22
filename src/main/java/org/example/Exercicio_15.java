package org.example;

public class Exercicio_15 {
    public static String exercicio_15(double a, double b, double c){


        if (a<=0 || b<=0 || c<=0 || a + b + c !=180 ){
            return "Não é um triângulo";
        }

        if (a>90 || b>90 || c>90){
            return "É um triângulo obtusângulo";

        }
        else if(a==90 || b==90 || c==90){
            return "É um triângulo retângulo";
        }
        return "É um triângulo acutângulo";
    }
}
