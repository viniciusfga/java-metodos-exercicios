package Nivel_7;

import java.util.Scanner;

public class Exercicio05 {
    /*
    Desenvolver um método que gere e retorne todos os números primos até um valor máximo informado.
     */
    public static boolean isPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirPrimos(int maximo) {

        for (int i = 1; i < maximo; i++) {
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorMaximo;
        System.out.println("Digite o valor maximo: ");
        valorMaximo = sc.nextInt();

        imprimirPrimos(valorMaximo);

        sc.close();
    }
}
