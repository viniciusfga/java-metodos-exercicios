package Nivel_5;

import java.util.Scanner;

public class Exercicio18 {
    /*
    Criar um método que recebe dois arrays de mesmo tamanho
    e retorna um array com a soma elemento a elemento.
     */
    static int[] somarElementos(int[] a, int[] b){
        int[] vetorSoma = new int[10];

        for(int i = 0; i < a.length; i++){
            vetorSoma[i] = a[i] + b[i];
        }

        return vetorSoma;
    }
    static int[] inserirElementos(int[] a){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        return a;
    }
    public static void main(String[] args) {

        int[] arrayA = new int[10];
        int[] arrayB = new int[10];

        inserirElementos(arrayA);
        inserirElementos(arrayB);

        int[] arrayC = new int[10];

        arrayC = somarElementos(arrayA, arrayB);
        for(int i = 0; i < arrayC.length; i++){
            System.out.print(arrayC[i] + " ");
        }
    }
}
