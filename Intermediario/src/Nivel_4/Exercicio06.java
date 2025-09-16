package Nivel_4;

public class Exercicio06 {
    /*
    Criar um método que recebe um array de int e retorna o menor valor.
    */
    public static void main(String[] args) {

        int[] numeros = {2,3,4,5,555,444,333,222,111, 1};

        int maior = maiorValor(numeros);

        System.out.println("Menor valor da array: " + maior);

    }
    public static int maiorValor (int[] n){
        int m = n[0];

        for (int i = 0; i < n.length; i++) {
            if (m > n[i] ) {
                m = n[i];
            }
        }

        return m;
    }
}
