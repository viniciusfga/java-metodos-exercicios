package Nivel_3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercicios25 {
    /*
    Criar um método que recebe o ano de nascimento e retorna a faixa etária (criança, jovem, adulto, idoso).
     */
    static String verificarFaixa(int nascimento){
        LocalDateTime agora = LocalDateTime.now();
        int atual = agora.getYear();

        String faixaEtaria = "";
        int idade = atual - nascimento;

        if (idade < 13) {
            faixaEtaria = "Criança";
        } else if (idade < 19) {
            faixaEtaria = "Adolescente";
        } else if (idade < 25) {
            faixaEtaria = "Jovem";
        } else if (idade < 66) {
            faixaEtaria = "Adulto";
        } else if (idade < 100) {
            faixaEtaria = "Idoso";
        }

        return faixaEtaria;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o ano de nascimento");
        int nascimento = sc.nextInt();

        String faixa = verificarFaixa(nascimento);
        System.out.println("Faixa etária: " + faixa);

    }
}
