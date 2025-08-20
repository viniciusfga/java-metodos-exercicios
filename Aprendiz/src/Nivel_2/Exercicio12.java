package Nivel_2;

public class Exercicio12 {
    public static void maim(String[] args){

        System.out.println("Criar um método que retorna se um número é múltiplo de 3 ou 5.");

        int numero = 10;

        boolean multiplo = VerificarMultiplo(numero);

        if (multiplo) {
            System.out.println("É multiplo");
        } else {
            System.out.println("Não é multiplo");
        }
    }
    public static boolean VerificarMultiplo (int n){
        return n % 3 == 0 || n % 5 == 0;
    }

}
