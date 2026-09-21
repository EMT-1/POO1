// Inicializa dos listas dinámicas: nombres y edades

package Actividad_13;

import java.util.ArrayList;
import java.util.List;

public class p083_InicializaNombresEdades {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(
            List.of("Juan", "Pedro", "Luis", "José", "Mateo", "María"));
        ArrayList<Integer> edades = new ArrayList<>(
            List.of(22, 25, 44, 38, 50, 16));
        System.out.println("\nLos nombres son:");
        for(String nombre : nombres)
            System.out.println(nombre);
        System.out.println("\nLas edades son:");
        for(int edad : edades)
            System.out.println(edad);
        System.out.println("\nCada nombre con su respectiva edad:");
        for(int i=0; i < nombres.size(); i++)
            System.out.printf("Nombre: %s, Edad: %d\n",
            nombres.get(i), edades.get(i));
        }
}