package Nivel_6;

import java.util.Scanner;

public class Exercicio21 {
    /*
    Criar um método que recebe um array de notas e retorna a média, maior nota e menor nota.
     */
    static double[] verificaNotas (double[] notas){
        double[] vetor = new double[3];

        double soma = 0, media = 0, maior = notas[0], menor = notas[0];
        for (int i = 0; i < notas.length; i++) {
            soma = notas[i];
            if (maior < notas[i]) maior = notas[i];
            if (menor > notas[i]) menor = notas[i];
        }
        media = soma / notas.length;

        vetor[0] = media; vetor[1] = maior; vetor[2] = menor;

        return vetor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            notas[i] = sc.nextDouble();
         }

        double[] vet = verificaNotas(notas);

        System.out.println("Média: " + vet[0]);
        System.out.println("Maior: " + vet[1]);
        System.out.println("Menor: " + vet[2]);

    }
}
