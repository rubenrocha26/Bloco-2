package org.example;

public class Exercicio_8 {
    public static String exercicio_8(int X, int Y){

        if (X<=0 || Y<=0){ // se X ou Y, <=0 return 0, pois não existe module de numeros 0 ou negativo
            return "0";
        }
        if (X==Y){
            return "-1 1";
        }
        int XmoduleY = X%Y;
        int YmoduleX = Y%X;

        if(XmoduleY == 0){ // X é múltiplo de Y
            return "-1";
        }
        if (YmoduleX == 0){ // Y é múltiplo de X
            return "1";
        }
        return "0";
    }
}
