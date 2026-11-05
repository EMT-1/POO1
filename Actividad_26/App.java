package Actividad_26;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String archivo = "datos.dat";
        ArrayList<Persona> datos = new ArrayList<>();
        int op;
        do {
            System.out.print("\033[H\033[2J");
            System.out.print("""
            ----- Procesamiento de datos -----
            1. Capturar datos
            2. Grabar datos en archivo
            3. Leer datos de archivo
            4. Mostrar datos
            5. Salir
            Elige una opción: """);
            op = teclado.nextInt(); teclado.nextLine();
            try {
                switch (op) {
                    case 1 -> Procesa.capturaDatos(datos);
                    case 2 -> {
                        if (datos.isEmpty()) System.out.println(
                        "No hay datos para grabar. Captura datos primero.");
                        else {
                            Procesa.grabarDatos(archivo, datos);
                            System.out.println("Datos grabados.");
                        }
                    }
                    case 3 -> {
                        Procesa.leerDatos(archivo, datos);
                        System.out.println("Datos leídos.");
                    }
                    case 4 -> {
                        if (datos.isEmpty()) System.out.println(
                        "No hay datos para mostrar.");
                        else Procesa.mostrarDatos(datos);
                    }
                    case 5 -> System.out.println("Saliendo del sistema...");
                    default -> System.out.println("Opción inválida.");
                }
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error con el archivo: " + e.getMessage());
            }
            System.out.println("Presiona Enter para continuar...");
            teclado.nextLine();
        } while (op != 5);

        teclado.close();
    }
}
