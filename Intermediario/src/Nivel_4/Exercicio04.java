package Nivel_4;

public class Exercicio04 {
    public static void main(String[] args) {

        System.out.println("Criar um método que recebe uma String e retorna quantas vogais ela contém.");

        String texto = "Java Runtime";
        int quantidade = contarVogais(texto);

        System.out.println("Quantidade de vogais: " + quantidade);

    }

    public static int contarVogais (String t){
        int qtd = 0;
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < t.length(); i++) {
            char l = t.charAt(i);

            for (int j = 0; j < vogais.length; j++) {
                if (l == vogais[j]) {
                    qtd++;
                }
            }
        }

        return qtd;
    }
}
