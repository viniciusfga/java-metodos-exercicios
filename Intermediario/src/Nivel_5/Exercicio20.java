package Nivel_5;

import java.util.Arrays;

public class Exercicio20 {
    /*
    Criar um método que verifica se dois arrays de int são iguais.
     */
    static boolean verificaArrays(int[] a, int[] b){
        boolean isIgual = false;

        if (Arrays.equals(a,b)){
            isIgual = true;
        }

        return isIgual;
    }
    public static void main(String[] args) {

        int[] vetorA = {1,2,3};
        int[] vetorB = {1,21,3};

        boolean isIgual = false;
        isIgual = verificaArrays(vetorA, vetorB);
        if (isIgual)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

    }
}
