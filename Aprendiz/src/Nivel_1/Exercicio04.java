package Nivel_1;

public class Exercicio04 {
    public static void main(String[] args) {

        System.out.println("Criar um método que retorna o quadrado de um número.");

        int numero = 3;

        int quadrado = GerarQuadrado(numero);

        System.out.println(quadrado);

    }
    public static int GerarQuadrado(int n){
        return n * n;
    }
}
