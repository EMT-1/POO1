// Dada una cantidad en horas, calcular su equivalente en días, minutos y segundos

package Practica_2;

import java.util.Scanner;

public class p014_CalculoTiempo {
    public static void main(String[] args) {
        System.out.println("Este programa calcula el equivalente en días, minutos y segundos dada una cantidad de horas");
        double horas, dias, minutos, segundos;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame la cantidad de horas: ");
        horas = scan.nextDouble();  
        dias = horas / 24;
        minutos = horas * 60;
        segundos = horas * 3600;
        System.out.println("Días: " + dias);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
        scan.close();
    }
}
