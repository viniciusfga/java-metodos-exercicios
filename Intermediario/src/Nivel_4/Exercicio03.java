package Nivel_4;

public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("Criar um método que recebe um array de String e imprime todos os elementos.");

        String[] palavras = {"Azul", "Amarelo", "Vermeho", "Verde"};

        imprimirElementos(palavras);

    }
    public static void imprimirElementos (String[] p){
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }
}
