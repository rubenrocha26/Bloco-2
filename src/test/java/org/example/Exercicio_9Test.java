package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_9Test {

    @Test
    public void test_constructor() {
        new Exercicio_9();
    }

    @ParameterizedTest
    @CsvSource({
            "99, 0",
            "0, 0",
            "-1, 0",
            "1000, 0",
            "10000, 0"
    })
    public void should_return_0_for_input_less_than_99_or_greater_than_999(int number, String expectedResult){
        //act
        String result = Exercicio_9.exercicio_9(number);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "100, A sequência de algarismos não é crescente",
            "105, A sequência de algarismos não é crescente",
            "999, A sequência de algarismos não é crescente",
            "121, A sequência de algarismos não é crescente",
            "712, A sequência de algarismos não é crescente",
            "778, A sequência de algarismos não é crescente",
            "144, A sequência de algarismos não é crescente",
    })
    public void should_return_nao_e_crescente(int number, String expectedResult){
        //act
        String result = Exercicio_9.exercicio_9(number);
        //assert
        assertEquals(expectedResult, result);
    }
    @ParameterizedTest
    @CsvSource({
            "123, A sequência de algarismos é crescente",
            "135, A sequência de algarismos é crescente",
            "789, A sequência de algarismos é crescente"
    })
    public void should_return_crescente(int number, String expectedResult){
        //act
        String result = Exercicio_9.exercicio_9(number);
        //assert
        assertEquals(expectedResult, result);
    }
}