package Practica_6;

import java.util.Scanner;

public class p078_SumaMultiplos {

    public static int sumaMultiplos(int ini, int fin, int mult) {
        int suma = 0;
        int contador = 0;
        StringBuilder encontrados = new StringBuilder();

        for (int i = ini; i <= fin; i++) {
            if (i % mult == 0) {
                suma += i;
                contador++;
                if (encontrados.length() > 0) encontrados.append(", ");
                encontrados.append(i);
            }
        }

        System.out.println("Múltiplos encontrados: " + encontrados);
        System.out.println("Total de múltiplos: " + contador);
        System.out.println("La suma de los múltiplos de " + mult + " es: " + suma);

        return suma;
    }

    public static boolean rangoValido(int ini, int fin) {
        return ini < fin;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        System.out.println("Menú:");
        System.out.println("1. Suma múltiplos de 3");
        System.out.println("2. Suma múltiplos de 4");
        System.out.print("Selecciona opción: ");
        opcion = teclado.nextInt();

        int mult;
        if (opcion == 1) mult = 3;
        else if (opcion == 2) mult = 4;
        else {
            System.out.println("Opción no válida.");
            return;
        }

        System.out.print("Introduce inicio: ");
        int ini = teclado.nextInt();
        System.out.print("Introduce fin: ");
        int fin = teclado.nextInt();

        if (!rangoValido(ini, fin)) {
            System.out.println("Error: el rango no es válido (inicio debe ser menor que fin).");
            return;
        }

        sumaMultiplos(ini, fin, mult);
    }
}
