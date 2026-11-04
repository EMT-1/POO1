package Actividad_25;

import java.io.*;

public class p140_Archivos5 {
    public static void main(String[] args) {
        String archivo = "persona.dat";
        // 1. Escritura
        try (DataOutputStream salida = new DataOutputStream(new FileOutputStream(archivo))) {
            salida.writeUTF("Ana");
            salida.writeInt(20);
            salida.writeDouble(62.5);
        } catch (IOException e) {
            System.err.println("Error al escribir: " + e.getMessage());
        }
        // 2. Lectura
        try (DataInputStream entrada = new DataInputStream(new FileInputStream(archivo))) {
            System.out.println("Nombre: " + entrada.readUTF());
            System.out.println("Edad: " + entrada.readInt());
            System.out.println("Peso: " + entrada.readDouble());
        } catch (IOException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }
}