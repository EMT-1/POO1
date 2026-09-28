public class Circulo {
    private double Radio;

    public Circulo() {
        this.Radio = 0.0;
    }

    public Circulo(double radio) {
        this.Radio = radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        this.Radio = radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(Radio, 2);
    }

    public double getCircunferencia() {
        return 2 * Math.PI * Radio;
    }

    @Override
    public String toString() {
        return "Circulo [Radio=" + Radio + "]";
    }
}