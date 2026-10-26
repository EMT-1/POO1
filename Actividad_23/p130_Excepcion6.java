package Actividad_23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p130_Excepcion6 {
    public static void main(String[] args) {
        File archivo = new File("nombres.txt");
        try (Scanner lector = new Scanner(archivo)) {
            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("No se encontró nombres.txt");
        }
        catch (SecurityException e) {
            System.out.println("No hay permiso de lectura");
        }
    }
}
