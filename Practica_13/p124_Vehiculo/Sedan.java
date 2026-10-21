package Practica_13.p124_Vehiculo;

public class Sedan extends Maquina implements Familiar {

    public Sedan(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    @Override
    public void carroceriaTres() {
        System.out.println("Es un vehículo familiar con carrocería de tres volúmenes.");
    }

    @Override
    public void chasisMonocasco() {
        System.out.println("Es un vehículo familiar con chasis monocasco.");
    }
}
