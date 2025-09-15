package Nivel_3;

import java.text.DecimalFormat;

public class Exercicios24 {
    /*
    Criar um método que recebe um número decimal e retorna o valor arredondado com duas casas decimais.
     */
    static double metodoArredondar(double v){
        return Math.round(v * 100.0) / 100.0;
    }
    public static void main(String[] args) {

        double valor = 3.141592;

        double valorArredondado = metodoArredondar(valor);
        System.out.println(valorArredondado);
    }

}
