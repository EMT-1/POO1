import java.util.Scanner;

public class p145_ArchivoEstudiante {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            Procesa proceso = new Procesa(teclado);
            int opcion;

            do {
                System.out.println("\\n--- MENU ---");
                System.out.println("1. Capturar datos");
                System.out.println("2. Grabar datos");
                System.out.println("3. Leer datos");
                System.out.println("4. Mostrar datos");
                System.out.println("5. Calcular estadisticas");
                System.out.println("6. Salir");
                System.out.print("Elige una opcion: ");

                String entrada = teclado.nextLine();

                try {
                    opcion = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    opcion = 0;
                }

                switch (opcion) {
                    case 1:
                        proceso.capturaDatos();
                        break;
                    case 2:
                        proceso.grabarDatos();
                        break;
                    case 3:
                        proceso.leerDatos();
                        break;
                    case 4:
                        proceso.mostrarDatos();
                        break;
                    case 5:
                        proceso.calcularEstadisticas();
                        break;
                    case 6:
                        System.out.println("Programa finalizado.");
                        break;
                    default:
                        System.out.println("Opcion no valida. Intenta de nuevo.");
                }
            } while (opcion != 6);

        } 

    }
}
