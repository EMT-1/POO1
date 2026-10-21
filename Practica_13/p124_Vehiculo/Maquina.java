package Practica_13.p124_Vehiculo;

public class Maquina implements Vehiculo {

    private String nombre;
    private String propietario;
    private int pasajeros;

    public Maquina(String nombre, String propietario, int pasajeros) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.pasajeros = pasajeros;
    }

    // Implementación de Vehiculo
    @Override
    public void encender() {
        System.out.println("Encendiendo el vehículo ...");
    }

    @Override
    public void desplazarse() {
        System.out.println("Desplazándose ...");
    }

    // Comportamientos propios
    public void repostar() {
        System.out.println("Repostando ...");
    }

    public void arrancar() {
        System.out.println("Arrancando ...");
    }

    public void frenar() {
        System.out.println("Frenando ...");
    }

    @Override
    public String toString() {
        return "Máquina [Tipo=" + getClass().getSimpleName()
                + ", Nombre=" + nombre
                + ", Propietario=" + propietario
                + ", Pasajeros=" + pasajeros + "]";
    }

    // Getters por si se requieren
    public String getNombre() { return nombre; }
    public String getPropietario() { return propietario; }
    public int getPasajeros() { return pasajeros; }
}
