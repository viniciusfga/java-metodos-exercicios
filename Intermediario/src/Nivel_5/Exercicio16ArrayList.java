package Nivel_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio16ArrayList {
    /*
    Criar um método que retorna um array com os números primos até um valor n.
     */
    public static int[] ObterPrimos(int n) {

        ArrayList<Integer> primosList = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (ehPrimo(i)) primosList.add(i);
        }

        int[] primos = new int[primosList.size()];
        for (int i = 0; i < primosList.size(); i++) {
            primos[i] = primosList.get(i);
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

        int n = input.nextInt();
        int[] primos = ObterPrimos(n);

        for (int i = 0; i < primos.length; i++) {
            System.out.print(primos[i] + " ");
        }
    }
}
