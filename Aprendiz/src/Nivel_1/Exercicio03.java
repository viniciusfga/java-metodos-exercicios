package Nivel_1;

public class Exercicio03 {
    public static void main(String[] args) {

        System.out.println("Criar um método que recebe dois int e imprime a soma.");

        int numero_1 = 8;
        int numero_2 = 8;

        Somar(numero_1, numero_2);

    }
    public static void Somar(int n_1, int n_2){
        int soma = n_1 + n_2;
        System.out.println(soma);
    }
}
