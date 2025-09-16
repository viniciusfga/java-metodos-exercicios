package Nivel_5;

public class Exercicio14 {
    /*
    Criar um método que recebe um array de String e retorna um novo array com todas em maiúsculo.
     */
    public static String[] ObterMaiusculo(String[] p) {

        for (int i = 0; i < p.length; i++) {
            p[i] = p[i].toUpperCase();
        }
        return p;
    }

    public static void main(String[] args) {

        String[] minusculo = {"letra", "palavra", "texto"};

        String[] maiusculo = ObterMaiusculo(minusculo);

        for (int i = 0; i < maiusculo.length; i++) {
            System.out.println(maiusculo[i] + " ");
        }
    }
}
