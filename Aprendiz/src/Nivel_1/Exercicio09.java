package Nivel_1;

public class Exercicio09 {
    public static void main(String[] args) {

        System.out.println("Criar um método que retorna a área de um retângulo (base x altura).");

        int base = 5;
        int altura = 4;

        int area = CalcularArea(base, altura);

        System.out.println("A área do retângulo é " + area + "cm². ");

    }
    public static int CalcularArea(int a, int b){
        int area = a * b;
        return area;
    }
}
