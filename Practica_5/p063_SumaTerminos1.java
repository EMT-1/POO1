// Se desea imprimir la secuencia de términos armónicos el número de renglones que el usuario desee y su suma

package Practica_5;

import java.util.Scanner;

public class p063_SumaTerminos1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("¿Cuántos términos? ");
        int terminos = obj.nextInt();

        double suma = 0;
        System.out.print("1");
        suma += 1;

        for (int i = 2; i <= terminos; i++) {
            System.out.print(" + 1/" + i);
            suma += 1.0 / i;
        }

        System.out.println();
        System.out.println("Suma " + suma);
        obj.close();
    }
}
