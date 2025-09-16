package Nivel_4;

public class Exercicio10 {
    /*
    Criar um método que recebe uma String e retorna true se for um palíndromo.
    */
    public static void main(String[] args) {

        String palavra = "ovo";

        System.out.println("Metodo A");
        if (verificarPalindromo(palavra)){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        System.out.println("Metodo B");
        if (verificarPalindromoReverse(palavra)){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }
    public static boolean verificarPalindromoReverse(String p) {
        return new StringBuilder(p).reverse().toString().equals(p);
    }

    public static boolean verificarPalindromo(String p) {
        boolean palindromo = true;

        StringBuilder invertida = new StringBuilder();
        for (int i = p.length() - 1; i >= 0 ; i--) {
            char l = p.charAt(i);
            invertida.append(l);
        }
        if (!invertida.toString().equals(p)) {
            palindromo = false;
        }

        return palindromo;
    }
}
