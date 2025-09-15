package Nivel_1;

public class Exercicio06 {
    /*
    Criar um método que calcula o dobro de um número e retorna o resultado.
     */
    public static void main(String[] args) {

        int numero = 3;

        int dobro = GerarDobro(numero);

        System.out.println(dobro);

    }
    public static int GerarDobro(int n){
        return 2 * n;
    }
}
