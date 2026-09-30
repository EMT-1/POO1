package Practica_9.p105_PuntoTriangulo;

public class Triangulo {
    // Atributos encapsulados
    private Punto v1;
    private Punto v2;
    private Punto v3;

    // Constructor por defecto
    public Triangulo() {
        this.v1 = new Punto();
        this.v2 = new Punto();
        this.v3 = new Punto();
    }

    // Constructor parametrizado
    public Triangulo(Punto v1, Punto v2, Punto v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    // Métodos Getters y Setters
    public Punto getV1() {
        return v1;
    }

    public void setV1(Punto v1) {
        this.v1 = v1;
    }

    public Punto getV2() {
        return v2;
    }

    public void setV2(Punto v2) {
        this.v2 = v2;
    }

    public Punto getV3() {
        return v3;
    }

    public void setV3(Punto v3) {
        this.v3 = v3;
    }

    // Método para calcular el perímetro
    // Suma las distancias entre V1-V2, V2-V3 y V3-V1
    public double getPerimetro() {
        double lado1 = this.v1.getDistancia(this.v2);
        double lado2 = this.v2.getDistancia(this.v3);
        double lado3 = this.v3.getDistancia(this.v1);
        return lado1 + lado2 + lado3;
    }

    // Método para determinar el tipo de triángulo
    public String getTipo() {
        double lado1 = this.v1.getDistancia(this.v2);
        double lado2 = this.v2.getDistancia(this.v3);
        double lado3 = this.v3.getDistancia(this.v1);

        // Usamos una pequeña tolerancia (epsilon) para comparar doubles debido a la precisión de punto flotante
        double epsilon = 0.0001;

        if (Math.abs(lado1 - lado2) < epsilon && Math.abs(lado2 - lado3) < epsilon) {
            return "Equilatero";
        } else if (Math.abs(lado1 - lado2) < epsilon || Math.abs(lado2 - lado3) < epsilon || Math.abs(lado3 - lado1) < epsilon) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }

    // Sobrescritura de toString
    @Override
    public String toString() {
        return "Triangulo [V1=" + v1.toString() + ", V2=" + v2.toString() + ", V3=" + v3.toString() + "]";
    }
}
