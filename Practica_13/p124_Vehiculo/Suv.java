package Practica_13.p124_Vehiculo;


public class Suv extends Maquina implements TodoTerreno {

    public Suv(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    @Override
    public void traccion4x4() {
        System.out.println("Es un vehículo todoterreno con tracción 4 x 4.");
    }

    @Override
    public void chasisIndependiente() {
        System.out.println("Es un vehículo todoterreno con chasis independiente.");
    }
}