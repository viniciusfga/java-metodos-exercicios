package Nivel_7;

public class Exercicio04 {
    /*
    Criar um método que receba uma string e retorne a quantidade de vogais, consoantes, números e caracteres especiais.
     */
    public static void analisarString(String texto){
        int vogais = 0;
        int consoantes = 0;
        int numeros = 0;
        int especiais = 0;

        for(int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isLetter(c)) { // É PALAVRA?
                char letra = Character.toLowerCase(c);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    vogais++;
                } else {
                    consoantes++;
                }
            } else if (Character.isDigit(c)) {
                numeros ++;
            } else  {
                especiais++;
            }
        }
        // Exibe o resultado
        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
        System.out.println("Números: " + numeros);
        System.out.println("Caract. especiais: " + especiais);

    }

    public static void main(String[] args) {
        String texto = "Olá, mundo! 123";
        System.out.println("Analise de String: " + texto);
        analisarString(texto);
    }
}
