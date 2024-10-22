package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_14Test {

    @Test
    public void test_constructor() {
        new Exercicio_14();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3, Não é um triângulo",
            "2, 1, 3, Não é um triângulo",
            "1, 3, 2, Não é um triângulo",
            "2, 7, 4, Não é um triângulo",
            "2, 4, 7, Não é um triângulo",
            "7, 2, 4, Não é um triângulo",
            "0, 0, 0, Não é um triângulo",
            "0, 1, 2, Não é um triângulo",
            "1, 0, 2, Não é um triângulo",
            "1, 2, 0, Não é um triângulo",
            "3, 3, 6, Não é um triângulo",
            "3, 6, 3, Não é um triângulo",
            "6, 3, 3, Não é um triângulo"
    })
    public void should_return_not_triangle ( double a, double b, double c, String expectedResult){
        //act
        String result = Exercicio_14.exercicio_14(a, b, c);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1, 1, É um triangulo Equilatero",
            "2, 2, 2, É um triangulo Equilatero",
            "3, 3, 3, É um triangulo Equilatero",
            "10.50, 10.50, 10.50, É um triangulo Equilatero"
    })
    public void should_return_triangle_retangle ( double a, double b, double c, String expectedResult){
        //act
        String result = Exercicio_14.exercicio_14(a, b, c);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 2, 3, É um triangulo Isósceles",
            "2, 3, 2, É um triangulo Isósceles",
            "3, 2, 2, É um triangulo Isósceles",
            "23.67, 23.67, 30.89, É um triangulo Isósceles"
    })
    public void should_return_triangle_isosceles ( double a, double b, double c, String expectedResult){
        //act
        String result = Exercicio_14.exercicio_14(a, b, c);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "5, 7, 8, É um triangulo Escaleno",
            "6, 8, 9, É um triangulo Escaleno",
            "7, 8, 10, É um triangulo Escaleno",
            "123.30, 123.31, 50.89, É um triangulo Escaleno"
    })
    public void should_return_triangle_escaleno ( double a, double b, double c, String expectedResult){
        //act
        String result = Exercicio_14.exercicio_14(a, b, c);
        //assert
        assertEquals(expectedResult, result);
    }
}