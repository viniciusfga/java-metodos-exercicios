package Nivel_6;

import java.util.HashMap;
import java.util.Map;

public class Exercicio25 {
    /*
    Criar um método que recebe um texto e retorna um mapa
    (Map<Character, Integer>) com a contagem de cada caractere.
     */

    public static Map<Character, Integer> contarCaracteres(String texto) {
        Map<Character, Integer> contagem = new HashMap<>();

        for (char c : texto.toCharArray()) {
            contagem.put(c, contagem.getOrDefault(c, 0) + 1);
        }

        // PARA ENTENDER MELHOR

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (contagem.containsKey(caracter)) {
                int valorAtual = contagem.get(caracter);
                contagem.put(caracter, valorAtual + 1);
            } else  {
                contagem.put(caracter, 1);
            }
        }

        return contagem;
    }

    public static void main(String[] args) {

        String text = "vinicius";
        Map<Character, Integer> cont = contarCaracteres(text);

        System.out.println(cont);
    }
}
