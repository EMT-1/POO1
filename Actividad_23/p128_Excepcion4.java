package Actividad_23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class p128_Excepcion4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            int a = entrada.nextInt();
            int b = entrada.nextInt();
            int resultado = a / b;
            System.out.println(resultado);
        }
        catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Usa enteros y un denominador ≠ 0");
        }
        entrada.close();
    }
}
