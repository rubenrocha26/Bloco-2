package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_6_easyTest {

    @Test
    public void test_constructor() {
        new Exercicio_6_easy();
    }

    @ParameterizedTest
    @CsvSource({
            "86401, 0",
            "86402, 0",
            "0, 0",
            "-1, 0"
    })
    public void should_return_0_for_seconds_less_or_equal_than_0_or_greater_or_equal_than_86401(int segundos, String expectedResult) {
        //act
        String result = Exercicio_6_easy.exercicio_6_easy(segundos);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "86400, 24:0:0",
            "86000, 23:53:20",
            "1, 0:0:1",
            "120, 0:2:0"
    })
    public void should_return_valid_time_for_seconds_between_1_and_86400_inclusive(int segundos, String expectedResult) {
        //act
        String result = Exercicio_6_easy.exercicio_6_easy(segundos);
        //assert
        assertEquals(expectedResult, result);
    }
}