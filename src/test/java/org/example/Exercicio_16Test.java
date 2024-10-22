package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_16Test {

    @Test
    public void test_constructor() {
        new Exercicio_16();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 10, 1, 0, 2:10",
            "15, 10, 1, 30, 16:40 ",
            "15, 10, 1, 55, 17:5",
            "23, 30, 1, 30, 1:0",  // Hora de chegada deoois da 00:00
            "23, 30, 24, 0, 23:30"  // Tempo total da viagem 24H
    })
    public void should_return_a_valid_hour_and_minute_for_valid_input (int horasPartida, int minutosPartida, int horasViagem, int minutosViagem, String expectedResult){
        //act
        String result = Exercicio_16.exercicio_16(horasPartida, minutosPartida, horasViagem, minutosViagem);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 10, 25, 0, error",
            "15, 10, 30, 30, error",
            "15, 10, 50, 55, error",
            "23, 30, 24, 01, error",  // Hora de chegada deoois da 00:00
            "24, 0, 0, 0, 0:0",
            "0, 60, 0, 0, 1:0",
            "0, 0, 24, 0, 0:0",
            "0, 0, 0, 60, 1:0"
    })
    public void should_return_error_for_invalid_input (int horasPartida, int minutosPartida, int horasViagem, int minutosViagem, String expectedResult) {
        //act
        String result = Exercicio_16.exercicio_16(horasPartida, minutosPartida, horasViagem, minutosViagem);
        //assert
        assertEquals(expectedResult, result);
    }

        @ParameterizedTest
        @CsvSource({
                "1, 1, 1, -1, error",
                "1, 1, -1, 1, error",
                "1, -1, 1, 1, error",
                "-1, 1, 1, 1, error",
                "0, 0, 0, -1, error",
                "0, 0, -1, 0, error",
                "0, -1, 0, 0, error",
                "-1, 0, 0, 0, error",
                "0, -1, -1, -1, error",
                "-1, 0, -1, -1, error",
                "-1, -1, 0, -1, error",
                "-1, -1, -1, 0, error",
                "0, 0, 0, 0, 0:0",
        })
        public void should_return_error_for_invalid_input_less_than_0 (int horasPartida, int minutosPartida, int horasViagem, int minutosViagem, String expectedResult){
            //act
            String result = Exercicio_16.exercicio_16(horasPartida, minutosPartida, horasViagem, minutosViagem);
            //assert
            assertEquals(expectedResult, result);
        }

    @ParameterizedTest
    @CsvSource({
            "25, 5, 5, 5, error",
            "5, 61, 5, 5, error",
            "5, 5, 25, 5, error",
            "5, 5, 5, 61, error ",


    })
    public void should_return_error_for_invalid_input_greater_than_time (int horasPartida, int minutosPartida, int horasViagem, int minutosViagem, String expectedResult){
        //act
        String result = Exercicio_16.exercicio_16(horasPartida, minutosPartida, horasViagem, minutosViagem);
        //assert
        assertEquals(expectedResult, result);
    }
}