// Inicializa dinámicamente una lista de números y la imprime

package Actividad_13;

import java.util.ArrayList;

public class p081_InicializaArregloNumeros {
    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<>();

        nums.add(5.0);
        nums.add(10.0);
        nums.add(15.5);
        nums.add(20.5);
        nums.add(25.0);
        nums.add(100.22);
        nums.add(90.0);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.printf("Primer elemento de la lista %.2f\n", nums.get(0));
        System.out.printf("Último elemento de la lista %.2f\n", nums.get(nums.size()-1));
        System.out.println("\nTodos los elementos con ciclo for:");

        for(int i=0; i < nums.size(); i++) {
        System.out.printf("%.2f ", nums.get(i));
        }
        System.out.println("\n\nTodos los elementos con ciclo for-each:");
        for(double n : nums) {
        System.out.printf("%.2f ", n);
        }
        System.out.println("\n\nProceso terminado");
        }
    }
