package Actividad_23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class p127_Excepcion3 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            int numerador = entrada.nextInt();
            int denominador = entrada.nextInt();
            int resultado =
            numerador / denominador;
            System.out.println(resultado);
        }
        catch (ArithmeticException e) {
            System.out.println("El denominador no puede ser 0");
        }
        catch (InputMismatchException e) {
            System.out.println("Escribe números enteros");
        }
        entrada.close();
    }
}
