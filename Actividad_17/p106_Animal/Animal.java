package Actividad_17.p106_Animal;

public class Animal {
    protected String Nombre;
    private int Edad;
    public Animal(String nombre, int edad) {
        Nombre = nombre;
        Edad = edad;
    }
    public String getNombre() {
        return Nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void comer() {
        System.out.println(Nombre + " está comiendo");
    }
    public void dormir() {
        System.out.println(Nombre + " está durmiendo");
    }
    @Override
    public String toString() {
        return "Nombre=" + Nombre + ", Edad=" + Edad;
    }
}