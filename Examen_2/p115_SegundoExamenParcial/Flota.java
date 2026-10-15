import java.util.ArrayList;

/**
 * Gestiona la flota de vehículos. Usa un ArrayList<Vehiculo>
 * para almacenar objetos de las subclases (polimorfismo).
 */
public class Flota {

    private String nombre;
    private String ciudad;
    private ArrayList<Vehiculo> vehiculos;

    public Flota(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    /** Suma de todos los bonos (llamada polimórfica a getBonoConductor). */
    public double getTotalBono() {
        double total = 0.0;
        for (Vehiculo v : vehiculos) {
            total += v.getBonoConductor();
        }
        return total;
    }

    /** Suma de todos los costos totales. */
    public double getTotalCosto() {
        double total = 0.0;
        for (Vehiculo v : vehiculos) {
            total += v.getCostoTotal();
        }
        return total;
    }

    /** Cuenta cuántos vehículos son instancias de CamionCarga. */
    public int getNumCamiones() {
        int cont = 0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof CamionCarga) cont++;
        }
        return cont;
    }

    /** Cuenta cuántos vehículos son instancias de AutobusPasajeros. */
    public int getNumAutobuses() {
        int cont = 0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof AutobusPasajeros) cont++;
        }
        return cont;
    }

    /** Imprime el reporte detallado de cada vehículo. */
    public void reporte() {
        System.out.println(">> Reporte Detallado de la Flota <<");
        for (Vehiculo v : vehiculos) {
            System.out.println(v.toString());
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return String.format(
            "Flota [Nombre=%s, Ciudad=%s, Vehículos=%d, BonoTotal=%.1f, CostoTotal=%.1f, Camiones=%d, Autobuses=%d]",
            nombre, ciudad, vehiculos.size(),
            getTotalBono(), getTotalCosto(),
            getNumCamiones(), getNumAutobuses()
        );
    }
}