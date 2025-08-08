package Nivel_01;

public class Exercicio10 {
    public static void main(String[] args) {

        System.out.println("Criar um método boolean isMaiorDeIdade(int idade) que retorna true se idade >= 18.");

        int idade = 17;

        boolean condicaoIdade = isMaiorDeIdade(idade);

        if (condicaoIdade) {
            System.out.println("É maior ou igual a 18");
        } else {
            System.out.println("É menor de 18");
        }
    }

    public static boolean isMaiorDeIdade(int i) {
        if (i < 18) {
            return false;
        }
        return true;
    }
}
