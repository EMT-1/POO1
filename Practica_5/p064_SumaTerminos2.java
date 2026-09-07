//Se desea imprimir la secuencia de términos, el número de renglones que el usuario desee y su suma
package Practica_5;

import java.util.Scanner;

public class p064_SumaTerminos2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("¿Cuántos términos? ");
        int terminos = obj.nextInt();

        long suma = 0;
        long termino = 0;

        for (int i = 1; i <= terminos; i++) {
            termino = termino * 10 + 1;
            System.out.print(termino);
            suma += termino;
            if (i < terminos) {
                System.out.print(" + ");
            }
        }

        System.out.println();
        System.out.println("suma " + suma);
        obj.close();
    }
}
