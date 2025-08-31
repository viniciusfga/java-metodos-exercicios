package Nivel_4;

public class Exercicio05 {
    public static void main(String[] args) {

        System.out.println("Criar um método que recebe um array de int e retorna o maior valor.");

        int[] numeros = {1,2,3,4,5,555,444,333,222,111};

        int maior = maiorValor(numeros);

        System.out.println("Maior valor da array: " + maior);

    }
    public static int maiorValor (int[] n){
        int m = n[0];

        for (int i = 0; i < n.length; i++) {
            if (m < n[i] ) {
                m = n[i];
            }
        }

        return m;
    }
}
