//Dado un número entero entre 1 y 6 que corresponde a un continente del mundo, escribir su nombre: 1 Asia, 2
//África, 3 América del Norte, 4 América del Sur, 5 Antártida, 6 Europa. Si el número no está en el rango
//especificado, mostrará un mensaje de error.

package Practica_3;

import java.util.Scanner;

public class p035_ContinentesMundo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int continente;

        System.out.print("Ingresa numero de continente entre 1 y 6: ");
        continente = obj.nextInt();

        switch (continente) {
            case 1:
                System.out.println("El continente es: Asia");
                break;
            case 2:
                System.out.println("El continente es: África");
                break;
            case 3:
                System.out.println("El continente es: América del Norte");
                break;
            case 4:
                System.out.println("El continente es: América del Sur");
                break;
            case 5:
                System.out.println("El continente es: Antártida");
                break;
            case 6:
                System.out.println("El continente es: Europa");
                break;
            default:
                System.out.println("Número no válido. Por favor, introduce un número entre 1 y 6.");
        }
        obj.close();
    }
}
