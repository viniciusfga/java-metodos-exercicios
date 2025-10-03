package Nivel_6;

import java.util.Scanner;

public class Exercicio23 {
    /*
    Criar um método que recebe uma matriz 3x3 e retorna a soma de cada linha em um array.
     */
    static double[] somaLinhas(double[][] matriz) {
        double soma[] = new double[matriz.length];

        int i = 0;
        for (double[] linha : matriz) {
            for (double valor : linha ) {
                soma[i] += valor;
            }
            i++;
        }

        return soma;
    }

    public static void main(String[] args) {

        double matriz[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        double[] vetorSoma = somaLinhas(matriz);

        for (int i = 0; i < vetorSoma.length; i++) {
            System.out.println("Soma da linha" + i + " : " + vetorSoma[i]);
        }

    }
}
