package Nivel_6;

public class Exercicio22 {
    /*
    Criar um método que criptografa uma String substituindo cada letra pelo próximo caractere no alfabeto.
     */
    static String criptografar(String texto) {
        StringBuilder strCripto = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            char proximo;

//            if (c == 'Z') proximo = 'A';
//            else if (c == 'z') proximo = 'a';
//            else proximo = (char) (c + 1);
            if (c >= 'A' && c <= 'Y') {
                proximo = (char) (c + 1);
            } else if (c == 'Z') {
                proximo = 'A';
            } else if (c >= 'a' && c <= 'y') {
                proximo = (char) (c + 1);
            } else if (c == 'z') {
                proximo = 'a';
            } else {
                proximo = c; // números, espaços, símbolos permanecem iguais
            }

            strCripto.append(proximo);
        }

        return strCripto.toString();
    }

    public static void main(String[] args) {

        String text = "ABCD XYZ abc xyz 123!";

        String cripto = criptografar(text);
        System.out.println(cripto);
        // Saída: BCDE YZA bcd yza 123!

    }
}
