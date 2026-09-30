package Practica_9.p105_PuntoTriangulo;

public class App {
    public static void main(String[] args) {
        
        // --- Datos para el Triángulo 1 ---
        Punto p1 = new Punto(5, 5);
        Punto p2 = new Punto(15, 15);
        Punto p3 = new Punto(5, 25);
        
        Triangulo t1 = new Triangulo(p1, p2, p3);
        
        // --- Datos para el Triángulo 2 ---
        // Según la salida esperada: V1=(15,5), V2=(15,15), V3=(5,25)
        Punto p4 = new Punto(15, 5);
        Punto p5 = new Punto(15, 15);
        Punto p6 = new Punto(5, 25);
        
        Triangulo t2 = new Triangulo(p4, p5, p6);

        // --- Impresión de resultados (Formato exacto de la imagen) ---
        
        // Imprimir el objeto Triangulo 1 (usa el toString de Triangulo)
        System.out.println(t1.toString());
        
        System.out.println(); // Línea en blanco
        
        // Imprimir el objeto Triangulo 2
        System.out.println(t2.toString());
        
        System.out.println(); // Línea en blanco
        
        // Imprimir detalles del Triángulo 1
        System.out.println("Triangulo 1 - Vertice 1 : " + t1.getV1().toString());
        System.out.println("Triangulo 1 - Vertice 2 : " + t1.getV2().toString());
        System.out.println("Triangulo 1 - Vertice 3 : " + t1.getV3().toString());
        System.out.println("Triangulo 1 - Perimetro : " + t1.getPerimetro());
        System.out.println("Triangulo 1 - Tipo      : " + t1.getTipo());
    }
}