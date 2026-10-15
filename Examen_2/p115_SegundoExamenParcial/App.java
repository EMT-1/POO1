/**
 * Clase principal del sistema de gestión de flota.
 *
 * ============================================================
 *  EXPLICACIÓN TÉCNICA: LATE BINDING (ENLACE DINÁMICO)
 * ============================================================
 * En este programa se utiliza LATE BINDING (o dynamic binding)
 * gracias al uso de polimorfismo con la clase abstracta Vehiculo.
 *
 * Cuando declaramos:
 *      Vehiculo v = new CamionCarga(...);
 *      Vehiculo v2 = new AutobusPasajeros(...);
 *
 * el tipo de referencia es Vehiculo, pero el objeto real en
 * memoria es de la subclase correspondiente. Al invocar:
 *
 *      v.getBonoConductor();
 *      v.getCostoTotal();
 *
 * la JVM no resuelve el método en tiempo de compilación, sino
 * en TIEMPO DE EJECUCIÓN (late binding), seleccionando la
 * implementación correcta según el tipo real del objeto.
 *
 * Esto permite que en Flota.reporte() o Flota.getTotalBono()
 * se recorran todos los vehículos del ArrayList<Vehiculo> y se
 * ejecute automáticamente la versión del método que corresponde
 * a cada subclase (CamionCarga o AutobusPasajeros), sin usar
 * condicionales instanceof para calcular el bono.
 * ============================================================
 */
public class App {

    public static void main(String[] args) {

        // -------- Reporte Inicial (flota vacía) --------
        System.out.println("--- Reporte Inicial ---");
        Flota flota = new Flota("División Norte", "Monterrey");
        System.out.println(flota.toString());
        System.out.println();

        // -------- Reporte Final con datos de prueba --------
        System.out.println("--- Reporte Final con Datos de Prueba ---");

        flota.agregarVehiculo(new CamionCarga("Volvo", "FMX", 30000, 2500.00, 4, 5000.0));
        flota.agregarVehiculo(new CamionCarga("Kenworth", "T680", 25000, 1800.00, 3, 4200.0));

        flota.agregarVehiculo(new AutobusPasajeros("Mercedes", "0500", 50, 1200.00, 5, 8500));
        flota.agregarVehiculo(new AutobusPasajeros("Irizar", "i6", 40, 1500.00, 8, 12000));
        flota.agregarVehiculo(new AutobusPasajeros("Scania", "K360", 45, 950.00, 4, 6200));

        flota.reporte();

        System.out.println(flota.toString());
    }
}