package Practica_10.p110_FormaV2;

public class Rectangulo extends Forma {
    private double largo;
    private double ancho;
    
    // Constructor por defecto
    public Rectangulo() {
        super();
        this.largo = 1.0;
        this.ancho = 1.0;
    }
    
    // Constructor con parámetros
    public Rectangulo(String color, boolean relleno, double largo, double ancho) {
        super(color, relleno);
        this.largo = largo;
        this.ancho = ancho;
    }
    
    // Métodos getter y setter
    public double getLargo() {
        return largo;
    }
    
    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    public double getAncho() {
        return ancho;
    }
    
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    // Implementación de métodos abstractos
    @Override
    public double getArea() {
        return largo * ancho;
    }
    
    @Override
    public double getPerimetro() {
        return 2 * (largo + ancho);
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Rectangulo [" + super.toString() + ", Largo=" + largo + ", Ancho=" + ancho + "]";
    }
}