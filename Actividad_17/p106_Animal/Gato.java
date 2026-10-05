package Actividad_17.p106_Animal;

public class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }
    public void maullar() {
        System.out.println(Nombre + " dice: miau");
    }
    @Override
    public String toString() {
        return "Gato [" + super.toString() + "]";
    }
}
