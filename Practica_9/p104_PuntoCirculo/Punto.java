public class Punto {
    // Atributos encapsulados (privados)
    private int x;
    private int y;

    // Constructor por defecto
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor parametrizado
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Métodos Get y Set
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Método para calcular la distancia a otro punto
    public double getDistancia(Punto p) {
        // Fórmula: raíz cuadrada de ((x2-x1)^2 + (y2-y1)^2)
        double diffX = Math.pow(this.x - p.getX(), 2);
        double diffY = Math.pow(this.y - p.getY(), 2);
        return Math.sqrt(diffX + diffY);
    }

    // Sobrecarga de toString
    @Override
    public String toString() {
        return "Punto [X=" + x + ", Y=" + y + "]";
    }
}