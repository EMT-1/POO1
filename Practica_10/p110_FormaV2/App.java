package Practica_10.p110_FormaV2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Crear lista de formas
        List<Forma> formas = new ArrayList<>();
        
        // Agregar formas a la lista
        formas.add(new Circulo("Rojo", true, 10.23));
        formas.add(new Circulo("Verde", false, 99.12));
        formas.add(new Rectangulo("Amarillo", false, 10.0, 20.0));
        formas.add(new Rectangulo("Azul", true, 15.0, 44.0));
        
        // Mostrar todas las formas
        System.out.println("Todas las formas :");
        for (Forma forma : formas) {
            System.out.println(forma);
        }
        
        // Calcular áreas y perímetros
        System.out.println("\nCalculando áreas y perímetros de las figuras:");
        for (Forma forma : formas) {
            System.out.println("La forma es un " + forma.getClass().getSimpleName());
            System.out.println("El área es : " + forma.getArea());
            System.out.println("El perímetro es : " + forma.getPerimetro());
            System.out.println();
        }
    }
}
