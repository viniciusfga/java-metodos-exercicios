package Nivel_01;

public class Exercicio02 {
    public static void main(String[] args) {

        System.out.println("Criar um método que recebe um int e imprime se ele é par.");

        int numero = 8;

        VerificarPar(numero);

    }

    public static void VerificarPar(int n) {
        if (n % 2 == 0) {
            System.out.println("É par!");
        }
    }
}
