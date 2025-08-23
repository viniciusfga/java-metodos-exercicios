package Nivel_2;

public class Exercicio17 {
    public static void main(String[] args) {

        System.out.println("Criar um método que recebe um caractere e retorna se é vogal.");

        char letra = 'i';
        boolean vogal = isVogal(letra);
        if (vogal) {
            System.out.println("É vogal");
        } else {
            System.out.println("Não é vogal");
        }

    }

    public static boolean isVogal(char l) {
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vogais.length; i++) {
            if (l == vogais[i]) {
                return true;
            }
        }
        return false;
    }

}
