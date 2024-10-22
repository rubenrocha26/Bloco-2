package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_12Test {

    @Test
    public void test_constructor() {
        new Exercicio_12();
    }

    @ParameterizedTest
    @CsvSource({
            "-1, 2, 2, 0",
            "2, -1, 2, 0",
            "2, 2, -1, 0"
    })
    public void should_return_0_if_any_input_less_than_0(int area, int numTree, int numBushes, String expectedResult){
        //act
        String result = Exercicio_12.exercicio_12(area, numTree, numBushes);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0, O tempo total é:0 e o custo total é: 0",
            "0, 0, 0, O tempo total é:0 e o custo total é: 0",
            "0, 0, 0, O tempo total é:0 e o custo total é: 0"
    })
    public void should_return_0_if_every_input_equal_0(int area, int numTree, int numBushes, String expectedResult){
        //act
        String result = Exercicio_12.exercicio_12(area, numTree, numBushes);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 2, 2, O tempo total é:1 e o custo total é: 90",
            "1, 1, 1, O tempo total é:1 e o custo total é: 45",
            "12, 0, 0, O tempo total é:1 e o custo total é: 130",
            "24, 0, 0, O tempo total é:2 e o custo total é: 260 ",
            "0, 12, 0, O tempo total é:2 e o custo total é: 260",
            "0, 0, 12, O tempo total é:1 e o custo total é: 190"
    })
    public void should_return_valid(int area, int numTree, int numBushes, String expectedResult){
        //act
        String result = Exercicio_12.exercicio_12(area, numTree, numBushes);
        //assert
        assertEquals(expectedResult, result);
    }

}