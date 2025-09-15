package Nivel_1;

public class Exercicio05 {
    /*
    Criar um método que recebe nome e idade e imprime uma mensagem formatada.
     */
    public static void main(String[] args) {

        String nome = "Marcos Alves";
        int idade = 9;

        GerarMensagem(nome, idade);

    }
    public static void GerarMensagem(String nome, int idade){
        System.out.printf("Olá, %s! Você tem %d anos. %n", nome, idade);
    }
}
