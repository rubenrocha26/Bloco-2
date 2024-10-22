package org.example;

public class Exercicio_14 {
    public static String exercicio_14 (double a, double b, double c){

        //Verficiar se os lados formam um triângulo válido
        if ((a< b+c) && (b<a+c) && (c< a+b)){
            //Verificar se é um triângulo equilátero
            if ((a==b) && (b==c)){
                return "É um triangulo Equilatero";
            }
            //Verificar se é um triângulo isósceles
            if ((a==b) || (b==c) || (a==c)){
                return "É um triangulo Isósceles";
            }
            else{
                return "É um triangulo Escaleno";
            }

        }
        else{
            return "Não é um triângulo";
        }

    }
}
