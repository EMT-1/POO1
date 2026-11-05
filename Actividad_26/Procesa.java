package Actividad_26;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Procesa {
    // Pide personas hasta que el nombre se deje vacío
    public static void capturaDatos(ArrayList<Persona> datos) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int edad;
        double peso;
        String correo;
        while (true) {
            System.out.print("\nNombre (vacío para terminar): ");
            nombre = teclado.nextLine();
            if (nombre.isEmpty()) break;
            System.out.print("Edad: "); edad = teclado.nextInt();
            System.out.print("Peso: "); peso = teclado.nextDouble();
            teclado.nextLine(); // consume el Enter que queda pendiente
            System.out.print("Correo: ");
            correo = teclado.nextLine();
            datos.add(new Persona(nombre, edad, peso, correo));
        }
        teclado.close();    
    }

    // Guarda la lista completa en el archivo
    public static void grabarDatos(String archivo,
    ArrayList<Persona> datos) throws IOException {
        try (ObjectOutputStream salida = new ObjectOutputStream(
        new FileOutputStream(archivo))) {
            salida.writeObject(datos);
        }
    }

    // Lee la lista completa desde el archivo y la deja en la lista recibida
    public static void leerDatos(String archivo, ArrayList<Persona>
    datos)
    throws IOException, ClassNotFoundException {
        try (ObjectInputStream entrada = new ObjectInputStream(
        new FileInputStream(archivo))) {
            ArrayList<Persona> leidos =
            (ArrayList<Persona>) entrada.readObject();
            datos.clear();
            datos.addAll(leidos);
        }
    }

    // Muestra todas las personas
    public static void mostrarDatos(ArrayList<Persona> datos) {
        for (Persona p : datos) {
            System.out.println(p);
        }
    }

    

}
