package p099_Rectangulo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingrese el largo: ");
        float largo = scanner.nextFloat();

        System.out.print("Ingrese el ancho: ");
        float ancho = scanner.nextFloat();

        // Crear el rectángulo con los datos del usuario
        Rectangulo r = new Rectangulo(largo, ancho);

        // Mostrar resultados
        System.out.println("Longitud : " + r.getLargo());
        System.out.println("Ancho    : " + r.getAncho());
        System.out.printf("area es: %.2f%n", r.getArea());
        System.out.printf("perimetro es: %.2f%n", r.getPerimetro());

        scanner.close();
    }
}