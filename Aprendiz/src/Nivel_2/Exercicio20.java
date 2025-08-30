package Nivel_2;

public class Exercicio20 {
    public static void main(String[] args) {

        System.out.println("Criar um método que calcula o fatorial de um número usando for.");

        int numero = 4;
        fatorial(numero);

    }
    public static void fatorial (int n){
        int fat = 1;

        for (int i = 1; i <= n; i++) {
            fat *= i;
        }

        System.out.println(fat);
    }
}
