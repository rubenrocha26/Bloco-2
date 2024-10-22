package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_11Test {

    @Test
    public void test_constructor() {
        new Exercicio_11();
    }

    @ParameterizedTest
    @CsvSource({
            "0.0,' '",
            "-1.0, ' '",
            "0.29, ' '",
            "0.30, ' '",
            "-0.30, ' '",
            "0.300000000000, ' '"
    })
    public void should_return_nothing_if_poluicao_equal_or_less_than_03(double poluicao, String expectedResult){
        //act
        String result = Exercicio_11.exercicio_11(poluicao);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "0.31, Grupo 1 atenção à poluição!",
            "0.39, Grupo 1 atenção à poluição!"
    })
    public void should_return_notify_group1_if_poluicao_less_than_04(double poluicao, String expectedResult){
        //act
        String result = Exercicio_11.exercicio_11(poluicao);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "0.40, Grupo 1 e 2 atenção à poluição!",
            "0.41, Grupo 1 e 2 atenção à poluição!",
            "0.49, Grupo 1 e 2 atenção à poluição!"
    })
    public void should_return_notify_group1_group2_if_poluicao_less_than_05(double poluicao, String expectedResult){
        //act
        String result = Exercicio_11.exercicio_11(poluicao);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "0.50, 'Grupo 1, 2 e 3 devem suspender as atividades!'",
            "0.51, 'Grupo 1, 2 e 3 devem suspender as atividades!'"
    })
    public void should_return_notify_group1_group2_group3_if_poluicao_less_greater_or_equal_05(double poluicao, String expectedResult){
        //act
        String result = Exercicio_11.exercicio_11(poluicao);
        //assert
        assertEquals(expectedResult, result);
    }
}