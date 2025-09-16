package Nivel_4;

public class Exercicio09 {
    /*
    Criar um método que recebe um array de String e retorna um único texto concatenado.
    */
    public static void main(String[] args) {

        String texto = "Abcd Efgh Ijkl Mnop";

        String concatenado = textoConcatenado(texto);

        System.out.println("Texto Concatenado: \n" + concatenado);

    }

    public static String textoConcatenado(String texto) {
        String primeiro = "";

        for (int i = 0; i < texto.length(); i++) {
            char l = texto.charAt(i);

            if (l != (' ')) {
                primeiro += l;
            }
        }

        return primeiro;
    }
}
