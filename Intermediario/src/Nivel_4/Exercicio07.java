package Nivel_4;

public class Exercicio07 {
    /*
    Criar um método que recebe um array e retorna uma cópia invertida.
    */
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        int[] invertida = arrayInvertida(array);

        System.out.print("Copia Invertida: ");
        for (int i = 0; i < invertida.length; i++) {
            System.out.print(invertida[i] + " ");
        }


    }

    public static int[] arrayInvertida(int[] a) {
        int[] invert = new int[a.length];

        int k = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            invert[k++] = a[i];
        }

        return invert;
    }
}
