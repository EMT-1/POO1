package Practica_14;

import java.util.Scanner;

public class p132_ExcepcionRaiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.print("Introduce un número: ");
                double numero = sc.nextDouble();

                if (numero < 0) {
                    // Forzamos una excepción genérica para negativos
                    throw new Exception("No puedo calcular la raíz cuadrada");
                }

                double raiz = Math.sqrt(numero);
                System.out.printf("El resultado es: %.2f%n", raiz);
                continuar = false; // salimos si todo salió bien

            } catch (Exception e) {
                System.out.println("Error no puedo calcular la raíz cuadrada");
                sc.nextLine(); // limpiar buffer
            }
        }
        sc.close();
    }
}