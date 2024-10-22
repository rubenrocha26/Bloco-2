package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_17Test {

    @Test
    public void test_constructor() {
        new Exercicio_17();
    }

    @ParameterizedTest
    @CsvSource({
            "-1, 1, 1, 1, error",
            "1, -1, 1, 1, error",
            "1, 1, -1, 1, error",
            "1, 1, 1, -1, error"
    })
    public void should_return_error_for_input_less_than_0 (int horaInicioProcessamento, int minutoInicioProessamento, int segundoInicioProcessamento, int duracaoProcessamentoSegundos, String expectedResult){
        //act
        String result = Exercicio_17.exercicio_17(horaInicioProcessamento,minutoInicioProessamento,segundoInicioProcessamento,duracaoProcessamentoSegundos);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1, 1, 0, 1:1:1",
            "1, 1, 0, 1, 1:1:1",
            "1, 0, 1, 1, 1:0:2",
            "0, 1, 1, 1, 0:1:2"

    })
    public void should_return_valid_output (int horaInicioProcessamento, int minutoInicioProessamento, int segundoInicioProcessamento, int duracaoProcessamentoSegundos, String expectedResult){
        //act
        String result = Exercicio_17.exercicio_17(horaInicioProcessamento,minutoInicioProessamento,segundoInicioProcessamento,duracaoProcessamentoSegundos);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "24, 0, 2, 300, error",
            "24, 0, 1, 500, error"

    })
    public void should_return_error_for_inicioProcessamentoSegundos_greater_or_equal_86401 (int horaInicioProcessamento, int minutoInicioProessamento, int segundoInicioProcessamento, int duracaoProcessamentoSegundos, String expectedResult){
        //act
        String result = Exercicio_17.exercicio_17(horaInicioProcessamento,minutoInicioProessamento,segundoInicioProcessamento,duracaoProcessamentoSegundos);
        //assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "25, 0, 1, 300, error",
            "21, 65, 1, 500, error",
            "21, 60, 61, 500, error",
            "24, 60, 65, 0, error",
            "24, 65, 60, 0, error",
            "25, 60, 60, 0, error",
            "24, 60, 60, 0, error",
            "24, 60, 60, 200, error",
            "24, 0, 0, 200, 0:3:20",
            "0, 60, 0, 200, 1:3:20",
            "0, 0, 60, 200, 0:4:20"

    })
    public void should_return_error_for_input_greater_than_time (int horaInicioProcessamento, int minutoInicioProessamento, int segundoInicioProcessamento, int duracaoProcessamentoSegundos, String expectedResult){
        //act
        String result = Exercicio_17.exercicio_17(horaInicioProcessamento,minutoInicioProessamento,segundoInicioProcessamento,duracaoProcessamentoSegundos);
        //assert
        assertEquals(expectedResult, result);
    }
}