package Practica_6;

import java.util.Scanner;

public class p079_Angulo {

    public static boolean anguloValido(double angulo) {
        return angulo >= 0 && angulo <= 360;
    }

    public static String tipoAngulo(double angulo) {
        if (angulo < 90) {
            return "Agudo";
        } else if (angulo == 90) {
            return "Recto";
        } else if (angulo < 180) {
            return "Obtuso";
        } else if (angulo == 180) {
            return "Llano";
        } else {
            return "Cóncavo";
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double angulo;

        do {
            System.out.print("Introduce un ángulo (0-360): ");
            angulo = teclado.nextDouble();
            if (!anguloValido(angulo)) {
                System.out.println("Error: el ángulo debe estar entre 0 y 360.");
            }
        } while (!anguloValido(angulo));

        System.out.println("Tipo de ángulo: " + tipoAngulo(angulo));
    }
}
