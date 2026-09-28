package p100_Articulo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Primer artículo con los datos iniciales
        Articulo a1 = new Articulo("A101", "Pluma Roja", 888, 0.08);
        System.out.println(a1.toString());

        // Modificamos cantidad y precio
        a1.setCant(999);
        a1.setPrecioUnit(0.99);
        System.out.println(a1.toString());

        // Mostramos cada atributo usando getters
        System.out.println("Id es: " + a1.getId());
        System.out.println("Desc es: " + a1.getDesc());
        System.out.println("Cant es: " + a1.getCant());
        System.out.println("PrecioUnit es: " + a1.getPrecioUnit());
        System.out.println("El Total es: " + a1.getTotal());

        // Lista de artículos
        ArrayList<Articulo> articulos = new ArrayList<>();
        articulos.add(a1);
        articulos.add(new Articulo("A102", "Pluma Azul", 934, 1.2));
        articulos.add(new Articulo("P103", "Lapiz del 12", 456, 0.5));

        // Mostrar todos los artículos
        System.out.println("\nTodos los articulos");
        double totalVenta = 0;
        for (Articulo art : articulos) {
            System.out.println(art.toString());
            totalVenta += art.getTotal();
        }

        // Total de la venta
        System.out.println("Total venta: " + totalVenta);
    }
}