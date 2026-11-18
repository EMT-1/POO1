package Practica_6;

import java.util.Scanner;

public class p076_DiaSemana {

    public static boolean validarRango(int n) {
        return n >= 1 && n <= 7;
    }

    public static String diaSemana(int dia) {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves",
                         "Viernes", "Sábado", "Domingo"};
        return dias[dia - 1];
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introduce un número (1-7): ");
            num = teclado.nextInt();
            if (!validarRango(num)) {
                System.out.println("Error: el número debe estar entre 1 y 7.");
            }
        } while (!validarRango(num));

        System.out.println("Dia: " + diaSemana(num));
    }
}