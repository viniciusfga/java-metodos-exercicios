package Nivel_5;

import java.util.Scanner;

public class Exercicio13 {
    /*
    Criar um método que recebe um texto e retorna outro sem espaços.
     */
    public static String removerEspacos(String texto){
        String resultado = texto;

        resultado = resultado.replace(" ", "");

        return resultado;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String texto = input.nextLine();

        String resultado = removerEspacos(texto);
        System.out.println(resultado);
    }
}
