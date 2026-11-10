import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class p144_ArchivoMaterias {
    public static void main(String[] args) {
        String nombreArchivo = "materias.txt";

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Introduce materias cursadas (separadas por coma): ");
            String entrada = teclado.nextLine();

            // Separa la entrada por comas y elimina espacios al inicio y al final.
            String[] materias = entrada.split(",");

            System.out.println("Escribiendo materias en el archivo...");

            try (BufferedWriter escritor =
                    new BufferedWriter(new FileWriter(nombreArchivo))) {
                for (String materia : materias) {
                    String materiaLimpia = materia.trim();

                    if (!materiaLimpia.isEmpty()) {
                        escritor.write(materiaLimpia);
                        escritor.newLine();
                    }
                }
            }

            System.out.println("Datos guardados con éxito.\n");
            System.out.println("Leyendo materias desde el archivo:");

            try (BufferedReader lector =
                    new BufferedReader(new FileReader(nombreArchivo))) {
                String linea;
                while ((linea = lector.readLine()) != null) {
                    System.out.println("- " + linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}
