package Nivel_5;

public class Exercicio11 {
    /*
    Criar dois métodos soma sobrecarregados: um que recebe dois int e outro que recebe dois double.
     */
    public int soma(int a, int b) {
        return a + b;
    }

    public double soma(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Exercicio11  ex = new Exercicio11();

        // Chamando o método soma com inteiros
        int resultadoInt = ex.soma(5, 10);
        System.out.println("Soma de inteiros: " + resultadoInt);

        // Chamando o método soma com doubles
        double resultadoDouble = ex.soma(5.5, 2.3);
        System.out.println("Soma de doubles: " + resultadoDouble);
    }
}

