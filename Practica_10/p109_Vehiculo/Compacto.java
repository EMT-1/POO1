package Practica_10.p109_Vehiculo;

public class Compacto extends Vehiculo {
    // Atributos particulares del compacto
    private int pasajeros;
    private int puertas;

    // Constructor sin parámetros
    public Compacto() {
        super();               // Llama al constructor de Vehiculo
        this.pasajeros = 0;
        this.puertas = 0;
    }

    // Constructor con parámetros: invoca al constructor de la clase base
    public Compacto(String serie, String marca, int anio, double precio,
                    int pasajeros, int puertas) {
        super(serie, marca, anio, precio);
        this.pasajeros = pasajeros;
        this.puertas = puertas;
    }

    // Getters y Setters
    public int getPasajeros() { return pasajeros; }
    public void setPasajeros(int pasajeros) { this.pasajeros = pasajeros; }

    public int getPuertas() { return puertas; }
    public void setPuertas(int puertas) { this.puertas = puertas; }

    // Sobrescritura de toString()
    @Override
    public String toString() {
        return "Compacto [" + super.toString() +
               ", Pasajeros=" + pasajeros + ", Puertas=" + puertas + "]";
    }
}
