package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_13Test {

    @Test
    public void test_constructor() {
        new Exercicio_13();
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0, 0, 0, NaN",
            "-1, 0, 0, 0, 0, NaN",
            "-0, -0, -0, -0, -0, NaN"
    })
    public void should_return_0_for_distancia_media_equal_0(int d1, int d2, int d3, int d4, int d5, double expectedResult) {
        //act
        double result = Exercicio_13.exercicio_13(d1, d2, d3, d4, d5);
        //assert
        assertEquals(result, expectedResult);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3, 4, 5, 4.827"
    })
    public void should_return_valid_double_for_distancia_media_greater_than_0(int d1, int d2, int d3, int d4, int d5, double expectedResult) {
        //act
        double result = Exercicio_13.exercicio_13(d1, d2, d3, d4, d5);
        //assert
        assertEquals(result, expectedResult);
    }
}