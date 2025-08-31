package Nivel_4;

public class Exercicio08 {
    public static void main(String[] args) {

        System.out.println("Criar um método que recebe um nome completo e retorna apenas o primeiro nome.");

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
