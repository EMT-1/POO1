package Practica_14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class p133_ExcepcionDulces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Número de niños en el barrio: ");
            int ninos = sc.nextInt();

            System.out.print("Cantidad de dulces en existencia: ");
            int dulces = sc.nextInt();

            int dulcesPorNino = dulces / ninos; // posible ArithmeticException
            System.out.println("A cada niño le tocan " + dulcesPorNino + " dulces.");

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida: debes introducir números enteros.");
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero (no hay niños).");
        }

        sc.close();
    }
}