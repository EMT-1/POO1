// Dada una cantidad en pesos y la cotización del dólar, se desea obtener el equivalente en dólares.

package Practica_2;

import java.util.Scanner;

public class p015_ConvertirADolares {
    public static void main(String[] args) {
        System.out.println("Este programa convierte una cantidad de pesos a dólares según una cotización dada");
        double pesos, cotizacion, dolares;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame la cantidad en pesos: ");
        pesos = scan.nextDouble();
        System.out.println("Dame la cotización del dólar: ");
        cotizacion = scan.nextDouble();
        dolares = pesos / cotizacion;
        System.out.println("Equivalente en dólares: " + dolares);
        scan.close();   
    }
}
