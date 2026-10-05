package Actividad_17.p106_Animal;

public class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }
    public void ladrar() {
        System.out.println(Nombre + " dice: guau");
    }
    @Override
    public String toString() {
        return "Perro [" + super.toString() + "]";
    }
}