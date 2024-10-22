package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_1Test {

    @Test
    public void test_constructor() {
        new Exercicio_1();
    }

    @ParameterizedTest
    @CsvSource ({
            "0, 0, 0, 1, 1, 1, 0",
            "1, 1, 1, 1, 1, 1, 1",
            "-1, -1, -1, 1, 1, 1, -1",
            "-1, 0, -1, 1, 1, 1, 0",
            "-1, -1, 0, 1, 1, 1, 0",
            "-2, 2, 0, 1, 1, 1, 0",
            "-2, 1, -1, 1, 1, 1, 0",
            "1, -1, 1, 1, 1, 1, 0",
            "5, 7, 9 , 1, 1, 1, 7 ",
            "5, 7, 9 , 2, 3, 5, 7"


    })
    public void should_return_a_valid_double_when_p1_p2_p3_are_positive_int( int n1, int n2, int n3, int p1, int p2, int p3, double resultadoEsperado){
        //act
        double result= Exercicio_1.exercicio_1( n1, n2, n3, p1, p2, p3);
        //assert
        assertEquals(resultadoEsperado, result, 0.00001);
    }

    @ParameterizedTest
    @CsvSource ({
            "0, 0, 0, -1, 1, 1",
            "1, 1, 1, 1, -1, 1",
            "-1, -1, -1, 1, 1, -1",
            "1, 1, 1, 0, 0, 0",
            "1, 1, 1, 0, 1, 1",
            "1, 1, 1, 1, 0, 1,",
            "1, 1, 1, 1, 1, 0"
    })
    public void should_return_nan_when_p1_p2_p3_are_not_positive_int_or_0( int n1, int n2, int n3, int p1, int p2, int p3){
        //act
        double result= Exercicio_1.exercicio_1( n1, n2, n3, p1, p2, p3);
        //assert
        assertEquals(Double.NaN, result);
    }



}