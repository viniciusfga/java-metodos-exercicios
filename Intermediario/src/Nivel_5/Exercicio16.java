package Nivel_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio16 {

    public static int[] ObterPrimos(int n) {

        // Primeiro, vamos contar quantos primos existem até n
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (ehPrimo(i)) count++;
        }

        // Criamos um array do tamanho exato
        int[] primos = new int[count];
        int index = 0;
        for (int i = 2; i <= n; i++) {
            if (ehPrimo(i)) {
                primos[index] = i;
                index++;
            }
        }
        return primos;
    }

    private static boolean ehPrimo(int num) {
        if (num < 2) return false;

        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Criar um método que retorna um array com os números primos até um valor n.");

        int n = input.nextInt();
        int[] primos = ObterPrimos(n);

        for (int i = 0; i < primos.length; i++) {
            System.out.print(primos[i] + " ");
        }
    }
}
