package Nivel_1;

public class Exercicio08 {
    public static void main(String[] args) {

        System.out.println("Criar um método que recebe três números e retorna a média.");

        int numero_1 = 4;
        int numero_2 = 4;
        int numero_3 = 10;

        int media = GerarMedia(numero_1, numero_2, numero_3);

        System.out.println(media);

    }
    public static int GerarMedia(int n1, int n2, int n3){
        int m = (n1 + n2 + n3) / 3;
        return m;
    }
}
