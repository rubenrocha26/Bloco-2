package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_15Test {

    @Test
    public void test_constructor() {
        new Exercicio_15();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 0, 0 ,Não é um triângulo",
            "0, 1, 0, Não é um triângulo",
            "0, 1, 1, Não é um triângulo ",
            "180, -180, 180, Não é um triângulo",
            "-180, 180, 180, Não é um triângulo",
            "180, 180, -180, Não é um triângulo",
            "-180, 360, 0, Não é um triângulo",
            "360, 0, -180, Não é um triângulo",
            "0, -180, 360, Não é um triângulo",
            "0, 0, 0, Não é um triângulo",
            "360, 0, 0, Não é um triângulo",
            "0, 360, 0, Não é um triângulo",
            "0, 0, 360, Não é um triângulo",
            "-1, -1, -1, Não é um triângulo",
            "90, 90, 90, Não é um triângulo",
            "180, 0, 0, Não é um triângulo",
            "0, 180, 0, Não é um triângulo",
            "0, 0, 180, Não é um triângulo",
            "0, 90, 90, Não é um triângulo",
            "90, 0, 90, Não é um triângulo",
            "90, 90, 0, Não é um triângulo"
    })
    public void should_return_nao_triangulo(double a, double b, double c, String expectedResult) {
        //act
        String result = Exercicio_15.exercicio_15(a, b, c);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "90, 45, 45, É um triângulo retângulo",
            "45, 45, 90, É um triângulo retângulo",
            "45, 90, 45, É um triângulo retângulo"
    })
    public void should_return_triangulo_retangulo(double a, double b, double c, String expectedResult) {
        //act
        String result = Exercicio_15.exercicio_15(a, b, c);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "100, 40, 40, É um triângulo obtusângulo",
            "40, 100, 40, É um triângulo obtusângulo",
            "40, 40, 100, É um triângulo obtusângulo"
    })
    public void should_return_triangulo_obtusângulo(double a, double b, double c, String expectedResult) {
        //act
        String result = Exercicio_15.exercicio_15(a, b, c);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "70, 30, 80, É um triângulo acutângulo",
            "30, 70, 80, É um triângulo acutângulo",
            "80, 30, 70, É um triângulo acutângulo",
            "60, 60, 60, É um triângulo acutângulo"
    })
    public void should_return_triangulo_acutangulo(double a, double b, double c, String expectedResult) {
        //act
        String result = Exercicio_15.exercicio_15(a, b, c);
        //assert
        assertEquals(expectedResult, result);
    }
}