package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_8Test {

    @Test
    public void test_constructor() {
        new Exercicio_8();
    }

    @ParameterizedTest
    @CsvSource({
            "10, 5, -1",
            "10, 1, -1"
    })
    public void should_return_minus1_for_x_multiplo_y (int X, int Y, String expectedResult) {
        //act
        String result = Exercicio_8.exercicio_8(X, Y);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "5, 10, 1",
            "1, 10, 1"
    })
    public void should_return_1_for_y_multiplo_x (int X, int Y, String expectedResult) {
        //act
        String result = Exercicio_8.exercicio_8(X, Y);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "5, 5, -1 1",
            "1, 1, -1 1"
    })
    public void should_return_minues1_1_for_x_equal_y (int X, int Y, String expectedResult) {
        //act
        String result = Exercicio_8.exercicio_8(X, Y);
        //assert
        assertEquals(expectedResult, result);
    }
    @ParameterizedTest
    @CsvSource({
            "1, 0, 0",
            "0, 1, 0",
            "-0, 0, 0",
            "0, -0, 0",
            "0, 0, 0",
            "-1, -1,0 ",
    })
    public void should_return_0_for_x_or_y_equal_or_less_than_0 (int X, int Y, String expectedResult) {
        //act
        String result = Exercicio_8.exercicio_8(X, Y);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "5, 3, 0",
            "3, 5, 0"
    })
    public void should_return_0_if_not_multiple (int X, int Y, String expectedResult) {
        //act
        String result = Exercicio_8.exercicio_8(X, Y);
        //assert
        assertEquals(expectedResult, result);
    }
}