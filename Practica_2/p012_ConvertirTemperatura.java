// Convierte una temperatura de grados fahrenheit a grados celsius

package Practica_2;

import java.util.Scanner;

public class p012_ConvertirTemperatura {
    public static void main(String[] args) {
        System.out.println("Este programa convierte una temperatura de Fahrenheit a Celsius");
        double fahrenheit, celsius;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dame los grados Fahrenheit: ");
        fahrenheit = scan.nextDouble();
        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Grados Celsius: " + celsius);
        scan.close();
    }
}
