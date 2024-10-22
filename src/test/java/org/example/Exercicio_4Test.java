package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_4Test {

    @Test
    public void test_constructor() {
        new Exercicio_4();
    }

    @ParameterizedTest
    @CsvSource({
            "-0.00001, -0.00001", //Muito perto de 0
            "-1.0, -1.0",
            "-2.0, -2.0",
            "-3.0, -3.0",
            "-0.0, -0.0"
    })
    public void should_return_x_if_x_equals_minus_0(double x, double resultadoEsperado) {
        //act
        double result = Exercicio_4.exercicio_4(x);
        //assert
        assertEquals(resultadoEsperado, result);
    }

@ParameterizedTest
    @CsvSource({
            "0.0, 0.0",
            "0.0000, 0.0",
            //Mutation Coverage
    })
    public void should_return_0_if_x_equal_0(double x, double resultadoEsperado) {
        //act
        double result = Exercicio_4.exercicio_4(x);
        //assert
        assertEquals(resultadoEsperado, result);
    }

    @ParameterizedTest
    @CsvSource({
            "1.0, -1.0",
            "2.0, 0.0",
            "3.0, 3.0"
    })
    public void should_return_a_valid_double_for_x_greater_than_0(double x, double resultadoEsperado) {
        //act
        double result = Exercicio_4.exercicio_4(x);
        //assert
        assertEquals(resultadoEsperado, result);
    }
}