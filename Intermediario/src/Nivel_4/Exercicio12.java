package Nivel_4;

import java.util.Scanner;

public class Exercicio12 {

    public double[] soma(double a, double b) {
        double[] resultados = new double[4];

        resultados[0] = a + b;
        resultados[1] = a - b;
        resultados[2] = a * b;
        resultados[3] = a / b;

        if (b != 0) {
            resultados[3] = a / b;
        } else {
            resultados[3] = Double.NaN;
        }

        return resultados;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exercicio12 ex = new Exercicio12();

        System.out.println("Criar um método que recebe dois números e retorna um array com [soma, subtração, multiplicação, divisão].");

        int a = input.nextInt();
        int b = input.nextInt();

        String[] operacoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        double[] resultado = ex.soma(a, b);

        for (int i = 0; i < operacoes.length; i++) {
            System.out.println(operacoes[i] + ": " + resultado[i]);
        }

    }
}

