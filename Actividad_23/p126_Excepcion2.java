package Actividad_23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class p126_Excepcion2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.print("Dame un valor: ");
            int valor = entrada.nextInt();
            System.out.println("Nuevo valor: " + (valor + 5));
        }
        catch (InputMismatchException e) {
        System.out.println("Debes introducir un número entero");
        }
        entrada.close();
    }
}