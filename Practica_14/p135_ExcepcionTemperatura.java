package Practica_14;

import java.util.InputMismatchException;
import java.util.Scanner;

// Excepción personalizada
class TemperaturaExcesiva extends Exception {
    public TemperaturaExcesiva(String mensaje) {
        super(mensaje);
    }
}

public class p135_ExcepcionTemperatura {

    // Función que convierte y valida la temperatura
    public static double convertirFahrenheit(double centigrados) throws TemperaturaExcesiva {
        if (centigrados > 100) {
            throw new TemperaturaExcesiva("Temperatura demasiado alta, no se puede convertir");
        }
        return (centigrados * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.print("Dame una temperatura en centígrados: ");
                double centigrados = sc.nextDouble();

                double fahrenheit = convertirFahrenheit(centigrados);
                System.out.printf("%.2f grados centígrados, equivale a %.2f grados fahrenheit%n",
                        centigrados, fahrenheit);
                continuar = false;

            } catch (InputMismatchException e) {
                System.out.println("La temperatura a convertir, debe ser un valor numerico");
                sc.nextLine(); // limpiar buffer
            } catch (TemperaturaExcesiva e) {
                System.out.println("Error : " + e.getClass().getName() + ": " + e.getMessage());
            }
        }
        sc.close();
    }
}