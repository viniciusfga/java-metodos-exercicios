package Nivel_4;

public class Exercicio08 {
    /*
    Criar um método que recebe um nome completo e retorna apenas o primeiro nome.
    */
    public static void main(String[] args) {

        String nomeCompleto = "Abcd Efgh Ijkl Mnop";

        String nome = obterPrimeiroNome(nomeCompleto);

        System.out.println("Primeiro nome: \n" + nome);

    }

    public static String obterPrimeiroNome(String texto) {
        String primeiro = "";

        for (int i = 0; i < texto.length(); i++) {
            char l = texto.charAt(i);

            if (l == (' ')) {
                break;
            }

            primeiro += l;
        }

        return primeiro;
    }
}
