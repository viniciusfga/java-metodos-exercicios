package Nivel_5;

import java.util.Scanner;

public class Exercicio19 {
    /*
    Criar um método que recebe uma String e retorna um array com cada palavra separada.
     */
    static String[] separarPalavras(String text) {
        String[] palavras = text.split(" ");

        return palavras;
    }

    static void imprimirPalavras(String[] p) {
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }

    public static void main(String[] args) {

        String texto = "Esta string contém cinco palavras";

        String[] palavras = separarPalavras(texto);
        imprimirPalavras(palavras);
    }
}
