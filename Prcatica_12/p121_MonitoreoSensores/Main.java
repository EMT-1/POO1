package Prcatica_12.p121_MonitoreoSensores;

public class Main {
    public static void main(String[] args) {
        SensorTemperatura sensor1 = new SensorTemperatura(28.40, 18.00, 27.00);
        SensorTemperatura sensor2 = new SensorTemperatura(22.50, 18.00, 24.00);

        // Uso de referencias de tipo Medible y Alertable (polimorfismo)
        Medible m1 = sensor1;
        Alertable a1 = sensor1;
        Medible m2 = sensor2;
        Alertable a2 = sensor2;

        mostrar("Sensor 1", m1, a1);
        mostrar("Sensor 2", m2, a2);
    }

    private static void mostrar(String nombre, Medible medible, Alertable alertable) {
        String estado = alertable.estaEnAlerta() ? "ALERTA" : "NORMAL";
        System.out.printf("%s: %.2f %s | %s%n",
                nombre, medible.leerValor(), medible.getUnidad(), estado);
    }
}
