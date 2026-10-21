package Practica_13.p124_Vehiculo;

// Main.java
public class App {
    public static void main(String[] args) {

        // ---- Sedan ----
        Sedan sedan = new Sedan("Vochito", "María Díaz", 4);
        System.out.println(sedan);
        sedan.encender();
        sedan.desplazarse();
        sedan.carroceriaTres();
        sedan.chasisMonocasco();
        sedan.repostar();
        sedan.arrancar();
        sedan.frenar();

        System.out.println();

        // ---- Suv ----
        Suv suv = new Suv("La Mamalona", "Carlos Castañeda", 6);
        System.out.println(suv);
        suv.encender();
        suv.desplazarse();
        suv.traccion4x4();
        suv.chasisIndependiente();
        suv.repostar();
        suv.arrancar();
        suv.frenar();
    }
}