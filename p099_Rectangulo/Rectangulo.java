package p099_Rectangulo;

public class Rectangulo {
    private float largo;
    private float ancho;

    // Constructor vacío
    public Rectangulo() {
        this.largo = 0.0f;
        this.ancho = 0.0f;
    }

    // Constructor con parámetros
    public Rectangulo(float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Getters y Setters
    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    // Área
    public float getArea() {
        return largo * ancho;
    }

    // Perímetro
    public float getPerimetro() {
        return 2 * (largo + ancho);
    }

    // toString
    @Override
    public String toString() {
        return "Rectangulo [Largo=" + largo + ", Ancho=" + ancho + "]";
    }
}