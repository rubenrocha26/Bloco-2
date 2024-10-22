package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_3Test {

    @Test
    public void test_constructor() {
        new Exercicio_3();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1, 1, 1, 0", // A(x1, y1) B(x2, y2)
            "-1, -1, -1, -1, 0",
            "1, 1, -1, -1, 2.828427",
            "0, 0, 0, 0, 0"
    })
    public void should_return_a_valid_double_for_int_input ( double x1, double y1, double x2, double y2, double expectedDistance){
        //act
        double result = Exercicio_3.exercicio_3(x1, y1, x2, y2);
        //assert
        assertEquals(expectedDistance, result, 0.001); //delta corresponde ao erro
    }

    @ParameterizedTest
    @CsvSource({
            "1.1, 1.1, 1.1, 1.1, 0", // A(x1, y1) B(x2, y2)
            "-1.1, -1.1, -1.1, -1.1, 0",
            "1.1, 1.1, -1.1, -1.1, 3.11127"
    })
    public void should_return_a_valid_double_for_double_input ( double x1, double y1, double x2, double y2, double expectedDistance){
        //act
        double result = Exercicio_3.exercicio_3(x1, y1, x2, y2);
        //assert
        assertEquals(expectedDistance, result, 0.001);
    }
}