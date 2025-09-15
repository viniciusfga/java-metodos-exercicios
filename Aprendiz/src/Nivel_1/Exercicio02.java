package Nivel_1;

public class Exercicio02 {
    /*
    Criar um método que recebe um int e imprime se ele é par.
     */
    public static void main(String[] args) {

        int numero = 8;

        VerificarPar(numero);

    }

    public static void VerificarPar(int n) {
        if (n % 2 == 0) {
            System.out.println("É par!");
        }
    }
}
