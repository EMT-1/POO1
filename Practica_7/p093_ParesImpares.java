// Este programa captura números, los almacena en un arreglo dinámico y muestra los números pares e impares, así como la cantidad de cada uno

package Practica_7;

import java.util.ArrayList;
import java.util.Random;

public class p093_ParesImpares {

    // Constante MAX
    static final int MAX = 100;

    // Función para llenar el arreglo con números aleatorios entre 0 y 20
    public static void llenarArreglo(ArrayList<Integer> arr) {
        Random rand = new Random();
        for (int i = 0; i < MAX; i++) {
            arr.add(rand.nextInt(21)); // 0 a 20 inclusive
        }
    }

    // Función para mostrar todos los elementos del arreglo
    public static void mostrarArreglo(ArrayList<Integer> arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Función para mostrar solo los elementos pares y contarlos
    public static int mostrarPares(ArrayList<Integer> arr) {
        int contador = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                contador++;
            }
        }
        System.out.println();
        return contador;
    }

    // Función para mostrar solo los elementos impares y contarlos
    public static int mostrarImpares(ArrayList<Integer> arr) {
        int contador = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                contador++;
            }
        }
        System.out.println();
        return contador;
    }

    public static void main(String[] args) {
        System.out.println("--- p093_ParesImpares ---");

        // Declaración de arreglos dinámicos
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>(); // b[] declarado según el enunciado

        // Rellenar el arreglo a[] con números aleatorios
        llenarArreglo(a);

        // Mostrar todos los elementos
        System.out.println("Elementos del arreglo a[]:");
        mostrarArreglo(a);

        // Mostrar pares y contar
        System.out.println("Elementos pares:");
        int cuentaPares = mostrarPares(a);

        // Mostrar impares y contar
        System.out.println("Elementos impares:");
        int cuentaImpares = mostrarImpares(a);

        // Mostrar cuentas finales
        System.out.println("Cantidad de pares: " + cuentaPares);
        System.out.println("Cantidad de impares: " + cuentaImpares);
    }
}