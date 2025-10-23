package Nivel_7;

public class Exercicio07 {
    /*
    Implementar um método que receba uma matriz e retorne a sua transposta.
     */
    public  static int[][] transpostaX(int[][] matriz){
        int LINHA = matriz[0].length;
        int COLUNA = matriz.length;
        int[][] transposta = new int[LINHA][COLUNA];

        for (int i = 0; i < LINHA; i++) {
            for (int j = 0; j < COLUNA; j++) {
                transposta[i][j] = matriz[j][i];
            }
        }

        return transposta;
    }
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 3},
                {2, 5},
        };

        int[][] transposta = transpostaX(matriz);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%2d", transposta[i][j]);
            }
            System.out.println();
        }

    }
}
