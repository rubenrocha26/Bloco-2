package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_6Test {

    @Test
    public void test_constructor() {
        new Exercicio_6();
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "-1, 0",
            "86401, 0",
            "86402, 0"
    })
    public void should_return_string_0_for_seconds_less_or_equal_0_and_greater_or_equal_86401(int seconds, String expectedResult) {
        //act
        String result = Exercicio_6.exercicio_6(seconds);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "59, Boa noite: 59 seconds",
            "2, Boa noite: 2 seconds"
    })
    public void should_return_string_seconds_for_seconds_less_than_60(int seconds, String expectedResult) {
        //act
        String result = Exercicio_6.exercicio_6(seconds);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "1, Boa noite: 1 second"
    })
    public void should_return_string_second_for_seconds_equal_1(int seconds, String expectedResult) {
        //act
        String result = Exercicio_6.exercicio_6(seconds);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "60, Boa noite: 1 minute"
    })
    public void should_return_string_minute_for_seconds_equal_60(int seconds, String expectedResult) {
        //act
        String result = Exercicio_6.exercicio_6(seconds);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "120, Boa noite: 2 minutes 0 seconds",
            "125, Boa noite: 2 minutes 5 seconds",
            " 3599, Boa noite: 59 minutes 59 seconds "
    })
    public void should_return_string_minutes_seconds_for_input_between_61_3599_inclusive(int seconds, String expectedResult) {
        //act
        String result = Exercicio_6.exercicio_6(seconds);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "3600, Boa noite: 1 hours 0 minutes 0 seconds",
            "3661, Boa noite: 1 hours 1 minutes 1 seconds"
    })
    public void should_return_string_hours_minutes_seconds_for_input_equal_or_greater_than_3600(int seconds, String expectedResult) {
        //act
        String result = Exercicio_6.exercicio_6(seconds);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "43200, Boa tarde: 12 hours 0 minutes 0 seconds",
            "71999, Boa tarde: 19 hours 59 minutes 59 seconds "
    })
    public void should_return_boa_tarde_for_hours_between_12_and_20(int seconds, String expectedResult) {
        //act
        String result = Exercicio_6.exercicio_6(seconds);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "86399, Boa noite: 23 hours 59 minutes 59 seconds",
            "72000, Boa noite: 20 hours 0 minutes 0 seconds ",
            "86400, Boa noite: 24 hours 0 minutes 0 seconds"
    })
    public void should_return_boa_noite_for_hours_between_20_and_6(int seconds, String expectedResult) {
        //act
        String result = Exercicio_6.exercicio_6(seconds);
        //assert
        assertEquals(expectedResult, result);
    }
    @ParameterizedTest
    @CsvSource({
            "43199, Bom dia: 11 hours 59 minutes 59 seconds",
            "21600, Bom dia: 6 hours 0 minutes 0 seconds"
    })
    public void should_return_bom_dia_for_hours_between_6_and_11(int seconds, String expectedResult) {
        String result = Exercicio_6.exercicio_6(seconds);
        assertEquals(expectedResult, result);
    }
}