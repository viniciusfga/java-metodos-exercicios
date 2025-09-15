package Nivel_2;

public class Exercicio12 {
    /*
    Criar um método que retorna se um número é múltiplo de 3 ou 5.
     */
    public static void main (String[] args){

        int numero = 11;

        boolean multiplo = verificarMultiplo(numero);

        if (multiplo) {
            System.out.println("É multiplo");
        } else {
            System.out.println("Não é multiplo");
        }
    }
    public static boolean verificarMultiplo (int n){
        if ( n % 3 == 0 || n % 5 == 0) {
            return true;
        }
        return false;
    }

}
