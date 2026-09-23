// Este programa captura números, los almacena en un arreglo dinámico y muestra el número mayor y menor

package Practica_7;

import java.util.ArrayList;
import java.util.Scanner;

public class p092_MayorMenor {

    // Función para capturar los números en un arreglo dinámico
    public static ArrayList<Integer> capturarNumeros(Scanner scanner, int cantidad) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }
        return numeros;
    }

    // Función para mostrar los elementos del arreglo
    public static void mostrarArreglo(ArrayList<Integer> numeros) {
        System.out.print("Elementos del arreglo : ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Función para encontrar el número mayor
    public static int encontrarMayor(ArrayList<Integer> numeros) {
        int mayor = numeros.get(0);
        for (int num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }

    // Función para encontrar el número menor
    public static int encontrarMenor(ArrayList<Integer> numeros) {
        int menor = numeros.get(0);
        for (int num : numeros) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- p092_MayorMenor ---");
        System.out.print("Cuántos números deseas capturar? ");
        int cantidad = scanner.nextInt();

        // Capturar los números
        ArrayList<Integer> numeros = capturarNumeros(scanner, cantidad);

        // Mostrar el arreglo
        mostrarArreglo(numeros);

        // Mostrar mayor y menor
        System.out.println("El número mayor es: " + encontrarMayor(numeros));
        System.out.println("El número menor es: " + encontrarMenor(numeros));

        scanner.close();
    }
}