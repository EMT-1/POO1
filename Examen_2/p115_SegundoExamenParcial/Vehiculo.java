/**
 * Clase abstracta base que representa un vehículo genérico de la flota.
 * Define los atributos y comportamientos comunes a todos los vehículos.
 */
public abstract class Vehiculo {

    // ---------- Atributos comunes ----------
    private String marca;
    private String modelo;
    private int capacidad;       // kg o pasajeros según el tipo
    private double costoBase;    // costo base de operación mensual
    private double costoTotal;   // se calcula en el constructor derivado

    // ---------- Constructor ----------
    public Vehiculo(String marca, String modelo, int capacidad, double costoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.costoBase = costoBase;
        this.costoTotal = 0.0; // se sobrescribe en la clase derivada
    }

    // ---------- Método abstracto (polimorfismo) ----------
    /**
     * Calcula el bono específico del conductor según el tipo de vehículo.
     * Cada subclase DEBE implementarlo con su propia fórmula.
     */
    public abstract double getBonoConductor();

    // ---------- Getters / Setters ----------
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public double getCostoBase() { return costoBase; }
    public void setCostoBase(double costoBase) { this.costoBase = costoBase; }

    public double getCostoTotal() { return costoTotal; }
    protected void setCostoTotal(double costoTotal) { this.costoTotal = costoTotal; }

    // ---------- toString sobrecargado ----------
    @Override
    public String toString() {
        return String.format(
            "Vehículo [Marca=%s, Modelo=%s, Capacidad=%d, CostoBase=%.2f]",
            marca, modelo, capacidad, costoBase
        );
    }
}