// Inicializa dinámicamente una lista de cadenas y la imprime

package Actividad_13;

import java.util.ArrayList;

public class p082_InicializaArregloCadenas {
    public static void main(String[] argss) {
        ArrayList<String> municipios = new ArrayList<>();
        municipios.add("Apozol");
        municipios.add("Apulco");
        municipios.add("Cañitas");
        municipios.add("Jerez");
        municipios.add("Fresnillo");
        municipios.add("Río Grande");
        municipios.add("Saín Alto");
        municipios.add("Sombrerete");
        municipios.add("Teúl de González Ortega");
        municipios.add("Zacatecas");
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.printf("Primer elemento de la lista %s\n", municipios.get(0));
        System.out.printf("Último elemento de la lista %s\n", municipios.get(municipios.size()-1));
        System.out.println("\nTodos los elementos con ciclo for:");
        for(int i=0; i < municipios.size(); i++) {
        System.out.printf("%s ", municipios.get(i));
        }
        System.out.println("\n\nTodos los elementos con ciclo for-each:");
        for(String municipio : municipios) {
        System.out.printf("%s ", municipio);
        }
        System.out.println("\n\nProceso terminado");
        }
    }