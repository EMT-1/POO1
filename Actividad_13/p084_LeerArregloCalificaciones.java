// Lee n calificaciones en una lista dinámica y calcula su promedio

package Actividad_13;

import java.util.ArrayList;
import java.util.Scanner;

public class p084_LeerArregloCalificaciones {
    public static void main(String[] args) {
        int n;
        float suma = 0, promedio;
        Scanner obj = new Scanner(System.in);
        ArrayList<Float> califs = new ArrayList<>();

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("¿Cuántas calificaciones deseas procesar? ");
        n = obj.nextInt();

        if (n <= 0) {
            System.out.println("El número de calificaciones debe ser mayor que cero.");
            obj.close();
            return;
        }

        System.out.printf("Introduce las %d calificaciones:\n", n);
        for (int i = 0; i < n; i++) {
            System.out.printf("Calificación %d: ", i + 1);
            califs.add(obj.nextFloat());
        }

        System.out.println("\nLa lista de calificaciones capturadas es:");
        for (float cal : califs) {
            System.out.printf("%.2f ", cal);
            suma += cal;
        }

        promedio = suma / califs.size();
        System.out.printf("\nLa suma es %.2f", suma);
        System.out.printf("\nEl promedio es %.2f", promedio);

        obj.close();
    }
}