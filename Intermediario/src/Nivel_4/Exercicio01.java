package Nivel_4;

public class Exercicio01 {
    /*
    Criar um método que recebe um array de int e retorna a soma dos elementos.
    */
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        int soma = somarNumeros(numeros);

        System.out.println(soma);

    }
    public static int somarNumeros(int[] n){
        int s = 0;
        for (int i = 0; i < n.length; i ++) {
            s += n[i];
        }
        return s;
    }
}
