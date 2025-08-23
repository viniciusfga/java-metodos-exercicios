package Nivel_2;

public class Exercicio16 {
    public static void main(String[] args) {

        System.out.println("Criar um método que retorna a tabuada de um número em forma de String.");

        int numero = 7;
        String resultado = gerarTabuada(numero);
        System.out.println(resultado);

    }

    public static String gerarTabuada(int n) {

        StringBuilder tabuada = new StringBuilder();
        for (int i = 0; i <= 10; i++) {
            tabuada.append(n)
            .append(" x ")
            .append(i)
            .append(" = ")
            .append(n * i)
            .append("\n");
        }

        return tabuada.toString();
    }
}

