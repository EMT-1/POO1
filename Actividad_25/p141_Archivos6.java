package Actividad_25;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class p141_Archivos6 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> datos = new ArrayList<>();
    static String archivo = "nombres.dat";

    static void capturar() {
        System.out.println(
        "\nEscribe datos (<Enter> vacío para terminar):");
        String linea;
        while (!(linea = sc.nextLine()).isEmpty()) {
            datos.add(linea);
        }
    }

    static void grabar() {
        if (datos.isEmpty()) {
            System.out.println("\nNo hay datos para grabar.");
            return;
        }
        try (DataOutputStream dos = new DataOutputStream(
        new FileOutputStream(archivo))) {
            dos.writeInt(datos.size());
            for (String d : datos) dos.writeUTF(d);
            System.out.println("\nDatos grabados con éxito.");
        } catch (IOException e) {
            System.out.println("\nError al grabar: " + e.getMessage());
        }
    }

    static void leer() {
        try (DataInputStream dis = new DataInputStream(
        new FileInputStream(archivo))) {
            datos.clear();
            int total = dis.readInt();
            for (int i = 0; i < total; i++) datos.add(dis.readUTF());
            System.out.println("\nDatos cargados con éxito.");
        } catch (IOException e) {
            System.out.println("\nError al leer archivo: " + e.getMessage());
        }
    }

    static void mostrar() {
        if (datos.isEmpty()) {
            System.out.println("\nNo hay datos para mostrar.");
            return;
        }
        System.out.println("\nDatos registrados:");
        for (String d : datos) System.out.println("- " + d);
    }
    public static void main(String[] args) {
        int op;
        do {
            System.out.print("\033[H\033[2J");
            System.out.print("""
            \n--- Procesamiento de datos ---
            [1] Capturar datos
            [2] Grabar en archivo
            [3] Leer de archivo
            [4] Mostrar datos
            [5] Salir
            Elige una opción: \
            """);
            op = sc.nextInt();
            sc.nextLine(); // Limpiar buffer
            switch (op) {
                case 1 -> capturar();
                case 2 -> grabar();
                case 3 -> leer();
                case 4 -> mostrar();
                case 5 -> System.out.println("\nSaliendo...");
                default -> System.out.println(
                "\nOpción no válida.");
            }

            System.out.print(
            "\nPresione <Enter> para continuar...");
            sc.nextLine();

        } while (op != 5);
    }
}