package Practica_14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class p134_ExcepcionEdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] edades = new int[5];

        System.out.println("# Captura las edades de 5 personas:");
        int i = 0;
        while (i < 5) {
            try {
                System.out.print("Edad persona " + (i + 1) + ": ");
                edades[i] = sc.nextInt();
                i++; // solo avanzamos si la entrada fue válida
            } catch (InputMismatchException e) {
                System.out.println("Introduce un numero entero");
                sc.nextLine(); // limpiar entrada inválida
            }
        }

        System.out.println("# Captura terminada");
        System.out.print("Las edades son: ");
        for (int edad : edades) {
            System.out.print(edad + " ");
        }
        System.out.println();
        sc.close();
    }
}