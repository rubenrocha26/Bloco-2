package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_5Test {

    @Test
    public void test_constructor() {
        new Exercicio_5();
    }

    //@ParameterizedTest
    //@CsvSource({
            //"1.0",
            //"2.0",
            //"0.00001",
            //"0.1"
    //})
    //public void should_return_volume_for_area_greater_than_0 (double area){
        //arrange
        //double aresta = Math.sqrt(area/6);
        //double volumeCheck = Math.pow(aresta, 3);  // aresta ao cubo
        //act
        //double result = Exercicio_5.volumeCalculator(area);
        //assert
        //assertEquals(volumeCheck, result);
    //}

    @ParameterizedTest
    @CsvSource({
            "-1.0, -1",
            "-2.0, -1",
            "-0.00001, -1",
            "-0.1, -1",
            "0.0, -1",
            "-0.0, -1"

    })
    public void should_return_minus1_for_area_equal_or_less_than_0 ( double area, String resultadoEsperado){
        //act
        String result = Exercicio_5.exercicio_5(area);
        //assert
        assertEquals(resultadoEsperado, result);
    }

    @ParameterizedTest
    @CsvSource({
            "1.0, 1 (pequeno)",
            "2.0, 1 (pequeno)",
            "0.00001, 1 (pequeno)",
            "0.1, 1 (pequeno)",
            "3.0, 1 (pequeno)",
            "6.0, 1 (pequeno)"  //area = 6, volume = 1

    })
    public void should_return_string_1pequeno_for_volume_less_or_equal_1 ( double area, String resultadoEsperado){
        //act
        String result = Exercicio_5.exercicio_5(area);
        //assert
        assertEquals(resultadoEsperado, result);
    }
    @ParameterizedTest
    @CsvSource({
            "9.524406311809198, 2 (médio)",  // area para volume ser exatamente igual a 2
            "9.0, 2 (médio)"
    })
    public void should_return_string_2medio_for_volume_less_or_equal_2 ( double area, String resultadoEsperado){
        //act
        String result = Exercicio_5.exercicio_5(area);
        //assert
        assertEquals(resultadoEsperado, result);
    }
    @ParameterizedTest
    @CsvSource({
            "10.0, 3 (grande)",
            "11.0, 3 (grande)"
    })
    public void should_return_string_3grande_for_volume_greater_than_2 ( double area, String resultadoEsperado){
        //act
        String result = Exercicio_5.exercicio_5(area);
        //assert
        assertEquals(resultadoEsperado, result);
    }
}