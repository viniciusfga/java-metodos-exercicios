package Nivel_5;

import java.util.Scanner;

public class Exercicio17 {
    /*
    Criar um método que recebe um texto e retorna o número de caracteres (ignorando espaços).
     */
    static int contarCaracteres(String caracteres){
        int numero = 0;

        caracteres = caracteres.replaceAll(" ", "");
        for(int i = 0; i < caracteres.length(); i++){
            numero++;
        }

        return numero;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int numero = contarCaracteres(text);
        System.out.println(numero);

    }
}
