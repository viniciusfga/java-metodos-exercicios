package Nivel_3;

public class Exercicio21 {
    public static void main(String[] args) {

        System.out.println("Criar um método que recebe uma frase e retorna quantas palavras ela tem.");

        String texto = " Java é      legal";

        int quantidade = QuantasPalavras(texto);
        System.out.println(quantidade);

    }

    public static int QuantasPalavras(String t) {
        int valor = 0;
        boolean palavra = false;

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if (c == ' ') {
                palavra = false;
            } else if (!palavra) {
                palavra = true;
                valor++;
            }
        }
        return valor;
    }
}

