package Nivel_7;

public class Exercicio09 {
    /*
     Desenvolver um método que simule a criptografia de uma string usando o algoritmo de cifra de César.
     */
    public static String criptografarString(String texto){
        String criptografia = "";
        int deslocamento = 3;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                c = (char) ((c - 'A' + deslocamento) % 26 + 'A');
            } else if (c >= 'a' && c <= 'z') {
                c = (char) ((c - 'a' + deslocamento) % 26 + 'a');
            }
            criptografia += c;
        }

        return criptografia;
    }
    public static void main(String[] args) {

        String texto = "java";
        System.out.println("Texto original: " + texto);
        System.out.println("Texto criptografado: " + criptografarString(texto));
    }
}
