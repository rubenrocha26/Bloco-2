package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_10Test {

    @Test
    public void test_constructor() {
        new Exercicio_10();
    }

    @ParameterizedTest
    @CsvSource({
            "-0.0, 0",
            "0.0, 0",
            "-1.0, 0"
    })
    public void should_return_0_for_price_less_than_0(double price, double expectedResult) {
        //act
        double result = Exercicio_10.exercicio_10(price);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "49.0, 39.2",
            "49.99, 39.992000000000004 ",
            "50.0, 40.0",
            "1.0, 0.8"
    })
    public void should_return_discount_20_for_price_equal_or_less_than_50(double price, double expectedResult) {
        //act
        double result = Exercicio_10.exercicio_10(price);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "50.01, 35.007",
            "70.0, 49.0",
            "99.99, 69.993",
            "100.0, 70.0"
    })
    public void should_return_discount_30_for_price_equal_or_less_than_100(double price, double expectedResult) {
        //act
        double result = Exercicio_10.exercicio_10(price);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "150.0, 90.0",
            "199.99, 119.994",
            "200.0, 120.0"
    })
    public void should_return_discount_40_for_price_equal_or_less_than_200(double price, double expectedResult) {
        //act
        double result = Exercicio_10.exercicio_10(price);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "300.0, 120.0"
    })
    public void should_return_discount_60_for_price_greater_than_200(double price, double expectedResult) {
        //act
        double result = Exercicio_10.exercicio_10(price);
        //assert
        assertEquals(expectedResult, result);
    }
}
