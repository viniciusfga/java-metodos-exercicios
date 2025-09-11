package Nivel_5;

public class Exercicio15 {

    public static int ObterPares(int[] v) {
        int pares = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }

    public static void main(String[] args) {

        System.out.println("Criar um método que recebe um array de int e retorna a quantidade de números pares.");

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        int pares = ObterPares(numeros);
        System.out.println(pares);
    }
}
