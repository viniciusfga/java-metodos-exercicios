package Nivel_1;

public class Exercicio04 {
    /*
    Criar um método que retorna o quadrado de um número.
     */
    public static void main(String[] args) {

        int numero = 3;

        int quadrado = GerarQuadrado(numero);

        System.out.println(quadrado);

    }
    public static int GerarQuadrado(int n){
        return n * n;
    }
}
