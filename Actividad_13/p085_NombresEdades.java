// Lee nombres y edades en listas dinámicas y calcula el promedio

package Actividad_13;

import java.util.ArrayList;
import java.util.Scanner;

public class p085_NombresEdades {
    public static void main(String[] args) {
        int n, suma=0, promedio;
        Scanner obj = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("¿Cuántos nombres deseas procesar? ");
        n = obj.nextInt();
        obj.nextLine();

        for(int i=0; i<n; i++) {
            System.out.printf("Dame el nombre %d: ", i+1);
            nombres.add(obj.nextLine());
            System.out.print("Dame su edad: ");
            edades.add(obj.nextInt());
            obj.nextLine();
        }

        System.out.println("\nNombre\tEdad");
        for(int i=0; i<nombres.size(); i++) {
            System.out.printf("%s\t%d\n", nombres.get(i), edades.get(i));
            suma += edades.get(i);
        }

        promedio = suma / edades.size();
        System.out.printf("\nEl promedio de edades es %d", promedio);
        }
}