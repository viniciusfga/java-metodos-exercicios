package Nivel_3;

import java.util.Scanner;

public class Exercicios23 {
    /*
    Criar um método que simula um saque em um caixa eletrônico e retorna as cédulas (100, 50, 20, 10).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do saque");
        int saque = sc.nextInt();

        int[] cedulas = {100, 50, 20, 10};
        int[] qtd = new int[cedulas.length];

        // CALCULAR
        for (int i = 0; i < cedulas.length; i++) {
            qtd[i] = (int) Math.floor(saque / cedulas[i]);
            saque = saque % cedulas[i];
        }
        // IMPRIMIR
        for (int i = 0; i < cedulas.length; i++) {
            System.out.println("Cédulas de " + cedulas[i] + " = " + qtd[i]);
        }
    }
}
