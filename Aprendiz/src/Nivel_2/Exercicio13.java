package Nivel_2;

public class Exercicio13 {
    public static void main(String[] args) {

        System.out.println("Criar um método que retorna se um número é primo.");

        int numero = 7;

        boolean primo = VerificarPrimo(numero);

        if (primo == true){
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }

    }
    public static boolean VerificarPrimo(int n){
        boolean primo = true;
        if (n <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    primo = false;
                    return primo;
                    break;
                }
            }
        }
        return primo;
    }

}
