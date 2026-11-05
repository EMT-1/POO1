package Actividad_26;

import java.io.Serializable;

// Una persona. Implementa Serializable para poder guardarla en un archivo.

public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int edad;
    private double peso;
    private String correo;
    public Persona(String nombre, int edad,
    double peso, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.correo = correo;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", correo=" + correo + "]";
    }
}