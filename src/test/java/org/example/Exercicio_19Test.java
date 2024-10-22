package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_19Test {

    @Test
    public void test_constructor() {
        new Exercicio_19();
    }

    @ParameterizedTest
    @CsvSource({
            "'D', '2º', 2, Invalid Kit",
            "'F', '2º', 2, Invalid Kit"
    })
    public void should_return_invalid_kit_for_kit_not_A_B_C(char tipoKit, String diaSemana, int distanciaKm, String expectedResult){
        //act
        String resutl = Exercicio_19.exercicio_19(tipoKit, diaSemana, distanciaKm);
        //assert
        assertEquals(expectedResult, resutl);
    }

    @ParameterizedTest
    @CsvSource({
            "'A', '7º', 2, Invalid Dia Semana",
            "'B', '8º', 2, Invalid Dia Semana",
            "'C', '9º', 2, Invalid Dia Semana"
    })
    public void should_return_invalid_dia_semana(char tipoKit, String diaSemana, int distanciaKm, String expectedResult){
        //act
        String resutl = Exercicio_19.exercicio_19(tipoKit, diaSemana, distanciaKm );
        //assert
        assertEquals(expectedResult, resutl);
    }

    @ParameterizedTest
    @CsvSource({
            "'A', '2º', 2, 30 euros + 4 euros da entrega",
            "'A', '3º', 2, 30 euros + 4 euros da entrega",
            "'A', '4º', 2, 30 euros + 4 euros da entrega",
            "'A', '5º', 2, 30 euros + 4 euros da entrega",
            "'A', '6º', 2, 30 euros + 4 euros da entrega"
    })
    public void should_return_valid_price_for_kit_A_dia_semana(char tipoKit, String diaSemana, int distanciaKm, String expectedResult){
        //act
        String resutl = Exercicio_19.exercicio_19(tipoKit, diaSemana, distanciaKm);
        //assert
        assertEquals(expectedResult, resutl);
    }

    @ParameterizedTest
    @CsvSource({
            "'A', 'Sab', 2, 40 euros + 4 euros da entrega",
            "'A', 'Dom', 2, 40 euros + 4 euros da entrega",
            "'A', 'Feriado', 2, 40 euros + 4 euros da entrega"
    })
    public void should_return_valid_price_for_kit_A_not_dia_semana(char tipoKit, String diaSemana, int distanciaKm, String expectedResult) {
        //act
        String resutl = Exercicio_19.exercicio_19(tipoKit, diaSemana, distanciaKm);
        //assert
        assertEquals(expectedResult, resutl);
    }

    @ParameterizedTest
    @CsvSource({
            "'B', '2º', 2, 50 euros + 4 euros da entrega",
            "'B', '3º', 2, 50 euros + 4 euros da entrega",
            "'B', '4º', 2, 50 euros + 4 euros da entrega",
            "'B', '5º', 2, 50 euros + 4 euros da entrega",
            "'B', '6º', 2, 50 euros + 4 euros da entrega"
    })
    public void should_return_valid_price_for_kit_B_dia_semana(char tipoKit, String diaSemana, int distanciaKm, String expectedResult) {
        //act
        String resutl = Exercicio_19.exercicio_19(tipoKit, diaSemana, distanciaKm);
        //assert
        assertEquals(expectedResult, resutl);
    }

    @ParameterizedTest
    @CsvSource({
            "'B', 'Sab', 2, 70 euros + 4 euros da entrega",
            "'B', 'Dom', 2, 70 euros + 4 euros da entrega",
            "'B', 'Feriado', 2, 70 euros + 4 euros da entrega"
    })
    public void should_return_valid_price_for_kit_B_not_dia_semana(char tipoKit, String diaSemana, int distanciaKm, String expectedResult) {
        //act
        String resutl = Exercicio_19.exercicio_19(tipoKit, diaSemana, distanciaKm);
        //assert
        assertEquals(expectedResult, resutl);
    }

    @ParameterizedTest
    @CsvSource({
            "'C', '2º', 2, 100 euros + 4 euros da entrega",
            "'C', '3º', 2, 100 euros + 4 euros da entrega",
            "'C', '4º', 2, 100 euros + 4 euros da entrega",
            "'C', '5º', 2, 100 euros + 4 euros da entrega",
            "'C', '6º', 2, 100 euros + 4 euros da entrega"
    })
    public void should_return_valid_price_for_kit_C_dia_semana(char tipoKit, String diaSemana, int distanciaKm, String expectedResult) {
        //act
        String resutl = Exercicio_19.exercicio_19(tipoKit, diaSemana, distanciaKm);
        //assert
        assertEquals(expectedResult, resutl);
    }

    @ParameterizedTest
    @CsvSource({
            "'C', 'Sab', 2, 140 euros + 4 euros da entrega",
            "'C', 'Dom', 2, 140 euros + 4 euros da entrega",
            "'C', 'Feriado', 2, 140 euros + 4 euros da entrega"
    })
    public void should_return_valid_price_for_kit_C_not_dia_semana(char tipoKit, String diaSemana, int distanciakm, String expectedResult) {
        //act
        String resutl = Exercicio_19.exercicio_19(tipoKit, diaSemana, distanciakm);
        //assert
        assertEquals(expectedResult, resutl);
    }

    @ParameterizedTest
    @CsvSource({
            "'C', 'Sab', -1, Invalid Distance",
            "'C', 'Dom', -2, Invalid Distance",
            "'C', 'Feriado', -3, Invalid Distance"
    })
    public void should_return_invalid_distance_for_distance_less_than_0(char tipoKit, String diaSemana, int distanciakm, String expectedResult) {
        //act
        String resutl = Exercicio_19.exercicio_19(tipoKit, diaSemana, distanciakm);
        //assert
        assertEquals(expectedResult, resutl);
    }

    @ParameterizedTest
    @CsvSource({
            "'C', 'Sab', 0, 140 euros + 0 euros da entrega",
            "'C', 'Dom', 2, 140 euros + 4 euros da entrega",
            "'C', 'Feriado', 2, 140 euros + 4 euros da entrega"
    })
    public void should_return_valid_price_and_distance(char tipoKit, String diaSemana, int distanciakm, String expectedResult) {
        //act
        String resutl = Exercicio_19.exercicio_19(tipoKit, diaSemana, distanciakm);
        //assert
        assertEquals(expectedResult, resutl);
    }

}