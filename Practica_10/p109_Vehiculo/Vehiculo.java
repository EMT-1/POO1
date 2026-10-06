package Practica_10.p109_Vehiculo;

public class Vehiculo {
    // Atributos generales del vehículo
    private String serie;
    private String marca;
    private int anio;      // "año" no es identificador válido por la ñ, usamos anio
    private double precio;

    // Constructor sin parámetros
    public Vehiculo() {
        this.serie = "";
        this.marca = "";
        this.anio = 0;
        this.precio = 0.0;
    }

    // Constructor con parámetros
    public Vehiculo(String serie, String marca, int anio, double precio) {
        this.serie = serie;
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
    }

    // Getters y Setters
    public String getSerie() { return serie; }
    public void setSerie(String serie) { this.serie = serie; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    // Sobrescritura de toString()
    @Override
    public String toString() {
        return "Vehiculo [Serie=" + serie + ", Marca=" + marca +
               ", Año=" + anio + ", Precio=" + precio + "]";
    }
}