package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_18Test {

    @Test
    public void test_constructor() {
        new Exercicio_18();
    }

    @ParameterizedTest
    @CsvSource({
            "-1, -1",
            "-2, -1"
    })
    public void should_return_minus_1_for_negative_input (int horasTrabalho, double expectedResult){
        //act
        double result = Exercicio_18.exercicio_18(horasTrabalho);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",  // Sem horas extras
            "1, 7.5",
            "35, 262.5"
    })
    public void should_return_a_valid_salario (int horasTrabalho, double expectedResult){
        //act
        double result = Exercicio_18.exercicio_18(horasTrabalho);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "36, 272.5",  // Horas extras
            "37, 282.5",
            "39, 302.5",
            "40, 312.5"
    })
    public void should_return_a_valid_salario_extra (int horasTrabalho, double expectedResult){
        //act
        double result = Exercicio_18.exercicio_18(horasTrabalho);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "41, 327.5",
            "45, 387.5",  // Horas extras extras
            "46, 402.5",
            "47, 417.5"
    })
    public void should_return_a_valid_salario_extra_extra (int horasTrabalho, double expectedResult){
        //act
        double result = Exercicio_18.exercicio_18(horasTrabalho);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "34, 255.0",  // Um a menos que 35
            "35, 262.5",  // Limite superior de horas normais
            "36, 272.5",  // Exatamente 1 hora extra
            "41, 327.5",  // Exatamente 1 hora extra extra
    })
    public void should_handle_boundary_cases(int horasTrabalho, double expectedResult) {
        double result = Exercicio_18.exercicio_18(horasTrabalho);
        assertEquals(expectedResult, result);
    }

}