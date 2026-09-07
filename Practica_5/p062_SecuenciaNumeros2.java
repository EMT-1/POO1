//Imprime secuencia numerica en forma de piramide dependiendo el nunmero dado por el usuario con sumatoria de 1 en 1

package Practica_5;

import java.util.Scanner;

public class p062_SecuenciaNumeros2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("¿Cuántos renglones? ");
        int renglones = obj.nextInt();

        for (int i = 1; i <= renglones; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Salto de línea después de cada renglón
        }
        obj.close();
    }
}

