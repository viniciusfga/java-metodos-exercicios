package Nivel_2;

public class Exercicio19 {
    public static void main(String[] args) {

        System.out.println("Criar um método que recebe uma nota (0–10) e retorna o conceito (A, B, C...).");

        System.out.println("Nota 9.5: " + obterConceito(9.5));
        System.out.println("Nota 8.0: " + obterConceito(8.0));
        System.out.println("Nota 7.4: " + obterConceito(7.4));
        System.out.println("Nota 5.9: " + obterConceito(5.9));
        System.out.println("Nota 11.0: " + obterConceito(11.0));

    }

    public static String obterConceito(double nota) {
        if (nota < 0 || nota > 10) {
            return "Nota inválida";
        } else if (nota >= 9.0) {
            return "A";
        } else if (nota >= 8.0) {
            return "B";
        } else if (nota >= 7.0) {
            return "C";
        } else if (nota >= 6.0) {
            return "D";
        } else {
            return "E";
        }
    }
}
