import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Procesa {
    private static final int MAX_ESTUDIANTES = 100;
    private static final String NOMBRE_ARCHIVO = "estudiantes.dat";

    private Estudiante[] estudiantes;
    private int cantidad;
    private Scanner teclado;

    public Procesa(Scanner teclado) {
        this.teclado = teclado;
        estudiantes = new Estudiante[MAX_ESTUDIANTES];
        cantidad = 0;
    }

    // Captura estudiantes y los almacena en el arreglo.
    public void capturaDatos() {
        if (cantidad == MAX_ESTUDIANTES) {
            System.out.println("El arreglo alcanzo su capacidad maxima.");
            return;
        }

        int cuantos = leerEntero("Cuantos estudiantes desea capturar: ", 1,
                MAX_ESTUDIANTES - cantidad);

        for (int i = 0; i < cuantos; i++) {
            System.out.println("\\nEstudiante " + (cantidad + 1));

            System.out.print("Nombre: ");
            String nombre = teclado.nextLine().trim();
            while (nombre.isEmpty()) {
                System.out.print("El nombre no puede estar vacio. Intente de nuevo: ");
                nombre = teclado.nextLine().trim();
            }

            int edad = leerEntero("Edad: ", 1, 120);
            double promedio = leerDouble("Promedio (0 a 10): ", 0, 10);
            String sexo = leerSexo();

            estudiantes[cantidad] = new Estudiante(nombre, edad, promedio, sexo);
            cantidad++;
        }

        System.out.println("\\nDatos capturados correctamente.");
    }

    // Guarda en un archivo el arreglo con los estudiantes capturados.
    public void grabarDatos() {
        try (ObjectOutputStream salida =
                new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO))) {
            Estudiante[] datos = Arrays.copyOf(estudiantes, cantidad);
            salida.writeObject(datos);
            System.out.println("Datos guardados correctamente en " + NOMBRE_ARCHIVO);
        } catch (IOException e) {
            System.out.println("Error al grabar los datos: " + e.getMessage());
        }
    }

    // Recupera del archivo el arreglo de estudiantes.
    public void leerDatos() {
        try (ObjectInputStream entrada =
                new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO))) {
            Object objeto = entrada.readObject();

            if (objeto instanceof Estudiante[]) {
                estudiantes = (Estudiante[]) objeto;
                cantidad = estudiantes.length;
                System.out.println("Se cargaron " + cantidad + " estudiante(s).");
            } else {
                System.out.println("El archivo no contiene un arreglo de estudiantes.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontro la clase necesaria: " + e.getMessage());
        }
    }

    // Muestra el contenido actual del arreglo.
    public void mostrarDatos() {
        if (cantidad == 0) {
            System.out.println("No hay estudiantes en el arreglo.");
            return;
        }

        System.out.println("\\n--- LISTA DE ESTUDIANTES ---");
        for (int i = 0; i < cantidad; i++) {
            Estudiante estudiante = estudiantes[i];
            System.out.println("\\nEstudiante " + (i + 1));
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Edad: " + estudiante.getEdad());
            System.out.println("Promedio: " + estudiante.getPromedio());
            System.out.println("Sexo: " + estudiante.getSexo());
        }
    }

    // Calcula los promedios y las cantidades por sexo.
    public void calcularEstadisticas() {
        if (cantidad == 0) {
            System.out.println("No hay datos para calcular estadisticas.");
            return;
        }

        double sumaPromedios = 0;
        int sumaEdades = 0;
        int hombres = 0;
        int mujeres = 0;

        for (int i = 0; i < cantidad; i++) {
            sumaPromedios += estudiantes[i].getPromedio();
            sumaEdades += estudiantes[i].getEdad();

            if (estudiantes[i].getSexo().equals("Hombre")) {
                hombres++;
            } else if (estudiantes[i].getSexo().equals("Mujer")) {
                mujeres++;
            }
        }

        System.out.println("\\n--- ESTADISTICAS ---");
        System.out.printf("Promedio de calificaciones: %.2f%n",
                sumaPromedios / cantidad);
        System.out.printf("Promedio de edades: %.1f años%n",
                (double) sumaEdades / cantidad);
        System.out.println("Cantidad de hombres: " + hombres);
        System.out.println("Cantidad de mujeres: " + mujeres);
    }

    private int leerEntero(String mensaje, int minimo, int maximo) {
        while (true) {
            System.out.print(mensaje);
            String entrada = teclado.nextLine();

            try {
                int valor = Integer.parseInt(entrada);
                if (valor >= minimo && valor <= maximo) {
                    return valor;
                }
            } catch (NumberFormatException e) {
                // Se vuelve a solicitar el dato.
            }

            System.out.println("Introduce un numero entero entre "
                    + minimo + " y " + maximo + ".");
        }
    }

    private double leerDouble(String mensaje, double minimo, double maximo) {
        while (true) {
            System.out.print(mensaje);
            String entrada = teclado.nextLine().replace(',', '.');

            try {
                double valor = Double.parseDouble(entrada);
                if (Double.isFinite(valor) && valor >= minimo && valor <= maximo) {
                    return valor;
                }
            } catch (NumberFormatException e) {
                // Se vuelve a solicitar el dato.
            }

            System.out.println("Introduce un numero entre " + minimo + " y " + maximo + ".");
        }
    }

    private String leerSexo() {
        while (true) {
            System.out.print("Sexo (H = Hombre, M = Mujer): ");
            String entrada = teclado.nextLine().trim();

            if (entrada.equalsIgnoreCase("H")
                    || entrada.equalsIgnoreCase("Hombre")) {
                return "Hombre";
            }
            if (entrada.equalsIgnoreCase("M")
                    || entrada.equalsIgnoreCase("Mujer")) {
                return "Mujer";
            }

            System.out.println("Opcion no valida. Escribe H o M.");
        }
    }
}
