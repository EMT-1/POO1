// el codigo declara numeros flotantes y los pone a 0 si son mayores a 10

package Practica_7;

import java.util.ArrayList;

public class p090_Temperaturas {

    // Función para mostrar los elementos del arreglo
    public static void mostrarElementos(ArrayList<Float> arreglo) {
        for (float elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    // Función para poner a 0 los elementos mayores a 10
    public static void ponerCeroMayoresA10(ArrayList<Float> arreglo) {
        for (int i = 0; i < arreglo.size(); i++) {
            if (arreglo.get(i) > 10) {
                arreglo.set(i, 0.0f);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("--- p090_Temperaturas ---");

        // Declarar e inicializar el arreglo dinámico de temperaturas
        ArrayList<Float> temperaturas = new ArrayList<>();
        temperaturas.add(2.34f);
        temperaturas.add(44.56f);
        temperaturas.add(7.89f);
        temperaturas.add(0.5f);
        temperaturas.add(2.5f);
        temperaturas.add(4.67f);
        temperaturas.add(40.3f);
        temperaturas.add(22.35f);
        temperaturas.add(56.22f);

        // Mostrar el primer elemento
        System.out.println("Primer elemento : " + temperaturas.get(0));

        // Mostrar el tercer elemento
        System.out.println("Tercer elemento : " + temperaturas.get(2));

        // Mostrar los elementos del arreglo
        System.out.print("Elementos del arreglo : ");
        mostrarElementos(temperaturas);

        // Poner a 0 todos los elementos mayores a 10
        ponerCeroMayoresA10(temperaturas);

        // Mostrar nuevamente los elementos del arreglo
        System.out.print("Elementos modificados : ");
        mostrarElementos(temperaturas);
    }
}