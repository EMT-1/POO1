package Practica_10.p109_Vehiculo;

public class Camioneta extends Vehiculo {
    // Atributos particulares de la camioneta
    private double capacidad;   // capacidad de carga
    private int ejes;           // cantidad de rodadas/ejes

    // Constructor sin parámetros
    public Camioneta() {
        super();
        this.capacidad = 0.0;
        this.ejes = 0;
    }

    // Constructor con parámetros: invoca al constructor de la clase base
    public Camioneta(String serie, String marca, int anio, double precio,
                     double capacidad, int ejes) {
        super(serie, marca, anio, precio);
        this.capacidad = capacidad;
        this.ejes = ejes;
    }

    // Getters y Setters
    public double getCapacidad() { return capacidad; }
    public void setCapacidad(double capacidad) { this.capacidad = capacidad; }

    public int getEjes() { return ejes; }
    public void setEjes(int ejes) { this.ejes = ejes; }

    // Sobrescritura de toString()
    @Override
    public String toString() {
        return "Camioneta [" + super.toString() +
               ", Capacidad=" + capacidad + ", Ejes=" + ejes + "]";
    }
}
