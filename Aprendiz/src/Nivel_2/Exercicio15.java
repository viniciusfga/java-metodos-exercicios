package Nivel_2;

public class Exercicio15 {
    /*
    Criar um método que imprime os 10 primeiros números pares.
     */
    public static void main(String[] args) {

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
