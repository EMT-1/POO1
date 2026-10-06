package Practica_10.p110_FormaV2;

public class Circulo extends Forma {
    private double radio;
    
    // Constructor por defecto
    public Circulo() {
        super();
        this.radio = 1.0;
    }
    
    // Constructor con parámetros
    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        this.radio = radio;
    }
    
    // Métodos getter y setter
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    // Implementación de métodos abstractos
    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Círculo [" + super.toString() + ", Radio=" + radio + "]";
    }
}