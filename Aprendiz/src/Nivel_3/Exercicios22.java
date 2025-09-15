package Nivel_3;

import java.util.Scanner;

public class Exercicios22 {

    /**
     * Exercício 22:
     * Criar um método que recebe uma senha e verifica se ela é forte
     * (tamanho > 8, contém letra, número e símbolo).
     */

    static void verificarSenha(String s){

        if(s.length() < 8){
            System.out.println("Senha inferior a 8 caracteres");
            return;
        }

        boolean temLetra = false;
        boolean temNumero = false;
        boolean temSimbolo = false;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                temLetra = true;
            } else if (Character.isDigit(c)) {
                temNumero = true;
            } else {
                // Não é letra nem dígito: é símbolo
                temSimbolo = true;
            }
        }

        if (!temLetra) {
            System.out.println("Senha deve conter pelo menos uma letra");
            return;
        }
        if (!temNumero) {
            System.out.println("Senha deve conter pelo menos um número");
            return;
        }
        if (!temSimbolo) {
            System.out.println("Senha deve conter pelo menos um símbolo");
            return;
        }

        System.out.println("Senha forte!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();

        verificarSenha(senha);

    }
}
