
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p143_ArchivoMunicipios {
    public static void main(String[] args) {
        String nombreArchivo = "deportes.txt";

        // Datos constantes solicitados en la practica.
        String[] deportes = {
            "Fútbol",
            "Béisbol",
            "Ciclismo",
            "Atletimso",
            "Natación",
            "Motociclismo"
        };

        try {
            System.out.println("Escribiendo datos en el archivo...");

            try (BufferedWriter escritor =
                    new BufferedWriter(new FileWriter(nombreArchivo))) {
                for (String deporte : deportes) {
                    escritor.write(deporte);
                    escritor.newLine();
                }
            }

            System.out.println("Datos escritos correctamente.\n");
            System.out.println("Leyendo datos del archivo:");

            try (BufferedReader lector =
                    new BufferedReader(new FileReader(nombreArchivo))) {
                String linea;
                while ((linea = lector.readLine()) != null) {
                    System.out.println(linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}
