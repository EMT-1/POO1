// Calcula el 3er angulo de un triángulo a partir de los otros dos ángulos.

package Practica_2;

import java.util.Scanner;

public class p011_CalcularAngulo {
    public static void main(String[] args) {
        System.out.println("Este programa calcula el tercer ángulo de un triángulo dados los dos primeros.");
        Scanner scan = new Scanner(System.in);
        double angulo1, angulo2, angulo3;
        System.out.print("Dame el ángulo 1: ");
        angulo1 = scan.nextDouble();
        System.out.print("Dame el ángulo 2: ");
        angulo2 = scan.nextDouble();
        angulo3 = 180 - (angulo1 + angulo2);
        System.out.println("Ángulo 3: " + angulo3);
        scan.close();
    }
}
