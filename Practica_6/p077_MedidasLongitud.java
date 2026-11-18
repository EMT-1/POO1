package Practica_6;

import java.util.Scanner;

public class p077_MedidasLongitud {

    public static double pulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }

    public static double metrosAPies(double metros) {
        return metros * 3.281;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        System.out.println("Menú:");
        System.out.println("1. Pulgadas a centímetros");
        System.out.println("2. Metros a pies");
        System.out.print("Selecciona opción: ");
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Introduce pulgadas: ");
                double pulgadas = teclado.nextDouble();
                System.out.printf("Resultado: %.1f cm%n",
                        pulgadasACentimetros(pulgadas));
                break;
            case 2:
                System.out.print("Introduce metros: ");
                double metros = teclado.nextDouble();
                System.out.printf("Resultado: %.3f pies%n",
                        metrosAPies(metros));
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}