package Nivel_7;

public class Exercicio01 {
    /*
    Criar um método que receba uma matriz bidimensional de inteiros e retorne a soma de todos os elementos.
    */

    static int retornarSoma(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                soma += matriz[i][j];

            }
        }
        return soma;
    }

    public static void main(String[] args) {

        int[][] matriz = new int[][]{
                {1, 2},
                {3, 4}
        };

        int resultado = retornarSoma(matriz);
        System.out.println("Soma dos elementos: " + resultado);
    }
}
