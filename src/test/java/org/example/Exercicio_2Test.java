package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_2Test {

    @Test
    public void test_constructor() {
        new Exercicio_2();
    }

    @ParameterizedTest
    @CsvSource({
            "50, 3",
            "60, 3",
            "70, 3",
            " 1000, 3",
            "1001, 3",
            "2000, 3"
    })
    public void should_return_3_string_for_number_less_than_100_or_greater_than_999(int number, String expectedResult){
        //act
        String result = Exercicio_2.exercicio_2(number);
        //assert
        assertEquals(expectedResult, result);

    }
    @ParameterizedTest
    @CsvSource({
            "100, 1 0 0",
            "999, 9 9 9",
            "500, 5 0 0",
            "600, 6 0 0",
            "700, 7 0 0"
    })
    public void should_return_a_valid_string_for_number_in_between_100_or_999_inclusive(int number, String expectedResult){
        //act
        String result = Exercicio_2.exercicio_2(number);
        //assert
        assertEquals(expectedResult, result);

    }
}