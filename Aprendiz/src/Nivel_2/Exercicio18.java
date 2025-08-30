package Nivel_2;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Criar um método que converte Celsius para Fahrenheit.");

        int c = sc.nextInt();
        double f  = CelsiusFahrenheit(c);
        System.out.println(f);

    }

    public static double CelsiusFahrenheit(int celsius) {

        double fahrenheit = (double) celsius * 9 / 5 + 32;

        return fahrenheit;
    }
}
