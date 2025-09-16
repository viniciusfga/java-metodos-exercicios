package Nivel_4;

public class Exercicio02 {
    /*
    Criar um método que recebe um array de double e retorna a média.
    */
    public static void main(String[] args){

        double[] vetor = {1.5 , 1.5 , 1.5};

        double media = CalcularMedia(vetor);

        System.out.println("Média: " + media);

    }
    public static double CalcularMedia(double[] vet){
        double soma = 0;

        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }

        double media = soma / vet.length;

        return media;
    }

}
