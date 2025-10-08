package Nivel_6;

import java.util.Random;

public class Exercicio24 {
    /*
    Criar um método que gera uma senha aleatória com letras, números e símbolos.
     */

    static String getPassword(Random random) {
        String alfabeto = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*";
        int tamanho = 10;
        StringBuilder sb = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            int indiceAleatorio = random.nextInt(alfabeto.length());
            sb.append(alfabeto.charAt(indiceAleatorio));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Random aleatorio = new Random();
        String senha = getPassword(aleatorio);
        System.out.println("Senha gerada: " + senha);
    }

}
