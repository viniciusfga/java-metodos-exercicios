package Nivel_2;

public class Exercicio14 {
    public static void main(String[] args) {

        System.out.println("Criar um método que inverte uma String.");

        String palavra= "Java";

        inverterString(palavra);

    }
    public static void inverterString(String p){

        System.out.println(p.length());

        for (int i = p.length() - 1 ; i >= 0; i--) {
            char letra = p.charAt(i);
            System.out.print(letra);
        }

    }
}
