package Nivel_2;

public class Exercicio15 {
    public static void main(String[] args) {

        System.out.println("Criar um método que imprime os 10 primeiros números pares.");

        NumerosPares();

    }
    public static void NumerosPares(){

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print( i + " ");
            }
        }
    }
}
