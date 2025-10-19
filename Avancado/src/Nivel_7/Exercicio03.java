package Nivel_7;

public class Exercicio03 {
    /*
    Implementar um método que calcule a potência de um número usando recursão.
     */
    public static int potencia(int base, int expoente){
        if(expoente == 0){
            return 1;
        } else {
            return base * potencia(base, expoente-1);
        }
    }
    public static void main(String[] args) {

        int numero = 10;
        int expoente = 2;
        int potencia = potencia(numero, expoente);
        System.out.println(potencia);
    }
}
