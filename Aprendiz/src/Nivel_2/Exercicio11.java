package Nivel_2;

public class Exercicio11 {
    public static void main(String[] args) {

        System.out.println("Criar um método que recebe dois números e retorna o maior.");

        int a = 17, b = 12;

        int maior = isMaior(a, b);

        System.out.println(maior + " é maior");

    }

    public static int isMaior(int i,int k) {
        if (i < k) {
            return k;
        } else {
            return i;
        }

    }
}
