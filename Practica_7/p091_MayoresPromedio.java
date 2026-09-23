// Este programa captura calificaciones, las sumna da promedio y muestra las caificaciones que esten por encima del promedio 

package Practica_7;

import java.util.ArrayList;
import java.util.Scanner;

public class p091_MayoresPromedio {

    // Función para mostrar los elementos del arreglo
    public static void mostrarArreglo(ArrayList<Float> arreglo) {
        System.out.print("Elementos del arreglo : ");
        for (float num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Función para calcular la suma de los elementos
    public static float calcularSuma(ArrayList<Float> arreglo) {
        float suma = 0;
        for (float num : arreglo) {
            suma += num;
        }
        return suma;
    }

    // Función para calcular el promedio
    public static float calcularPromedio(ArrayList<Float> arreglo) {
        if (arreglo.isEmpty()) return 0;
        return calcularSuma(arreglo) / arreglo.size();
    }

    // Función para mostrar los elementos mayores al promedio y contarlos
    public static int mostrarMayoresAlPromedio(ArrayList<Float> arreglo, float promedio) {
        System.out.print("Elementos mayores al promedio: ");
        int contador = 0;
        for (float num : arreglo) {
            if (num > promedio) {
                System.out.print(num + " ");
                contador++;
            }
        }
        System.out.println();
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> calificaciones = new ArrayList<>();

        System.out.print("Cuántas calificaciones deseas capturar? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            float calificacion = scanner.nextFloat();
            calificaciones.add(calificacion);
        }

        // Mostrar elementos
        mostrarArreglo(calificaciones);

        // Calcular y mostrar suma
        float suma = calcularSuma(calificaciones);
        System.out.println("Suma: " + suma);

        // Calcular y mostrar promedio
        float promedio = calcularPromedio(calificaciones);
        System.out.println("Promedio: " + promedio);

        // Mostrar elementos mayores al promedio y contar
        int totalMayores = mostrarMayoresAlPromedio(calificaciones, promedio);
        System.out.println("Total de elementos mayores al promedio: " + totalMayores);

        scanner.close();
    }
}