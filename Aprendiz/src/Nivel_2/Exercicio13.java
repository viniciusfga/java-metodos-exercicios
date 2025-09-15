package Nivel_2;

public class Exercicio13 {
    /*
    Criar um método que retorna se um número é primo.
     */
    public static void main(String[] args) {

        int numero = 12;

        boolean primo = verificarPrimo(numero);

        if (primo == true){
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }

    }
    public static boolean verificarPrimo(int n){
        boolean primo = true;
        if (n <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    primo = false;
                    return primo;
                }
            }
        }
        return primo;
    }

}
