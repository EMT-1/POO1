package Practica_9.p105_PuntoTriangulo;

public class Punto {
    // Cambiamos int por double
    private double x; 
    private double y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    // El constructor ahora recibe double
    public Punto(double x, double y) { 
        this.x = x;
        this.y = y;
    }

    // Los getters y setters también cambian a double
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDistancia(Punto p) {
        double dx = this.x - p.getX();
        double dy = this.y - p.getY();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    @Override
    public String toString() {
        // Quitamos los decimales innecesarios en la impresión si son enteros
        return "Punto [X=" + x + ", Y=" + y + "]";
    }
}