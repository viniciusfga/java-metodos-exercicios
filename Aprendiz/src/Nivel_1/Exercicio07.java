package Nivel_1;

public class Exercicio07 {
    /*
    Criar um método que verifica se um número é positivo ou negativo.
     */
    public static void main(String[] args) {

        int numero = -3;

        Verificar(numero);


    }
    public static void Verificar(int n){
        if ( n > 0) {
            System.out.println(n +  " Positivo");
        } else {
            System.out.println(n + " Negativo");
        }

    }
}
