package Actividad_23;

public class p131_MiExcepcion {
    static int sumar(int a, int b) throws FueraDeRango {
        if (a > 100 || b > 100) {
            throw new FueraDeRango("Valores fuera de rango");
        }
        return a + b;
    }

    public static void main(String[] args) {
        try {
            sumar(101, 10);
        } catch (FueraDeRango e) {
            System.out.println(e.getMessage());
        }
    }
}

class FueraDeRango extends Exception {
    public FueraDeRango(String mensaje) {
        super(mensaje);
    }
}
