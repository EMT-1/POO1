public class Circulo {
    // Atributos encapsulados
    private Punto centro;
    private double radio;

    // Constructor por defecto
    public Circulo() {
        this.centro = new Punto(); // Centro en (0,0)
        this.radio = 1.0;
    }

    // Constructor parametrizado
    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    // Métodos Get y Set
    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular la circunferencia
    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }

    // Sobrecarga de toString
    @Override
    public String toString() {
        return "Circulo [Centro=" + centro.toString() + ", Radio=" + radio + "]";
    }
}