package Nivel_1;

public class Exercicio07 {
    public static void main(String[] args) {

        System.out.println("Criar um método que verifica se um número é positivo ou negativo.");

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
