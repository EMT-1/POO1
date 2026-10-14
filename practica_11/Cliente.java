import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Cliente {
    private String nombre;
    private String domicilio;
    private String correo;
    private List<Venta> ventas;

    public Cliente(String nombre, String domicilio, String correo) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.correo = correo;
        this.ventas = new ArrayList<>();
    }

    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    }

    public double getTotal() {
        double acumulado = 0.0;
        for (Venta venta : ventas) {
            acumulado += venta.getTotalVenta();
        }
        return acumulado;
    }

    public int getCantidadVentas() {
        return ventas.size();
    }

    public List<Venta> getVentas() {
        return new ArrayList<>(ventas);
    }

    @Override
    public String toString() {
        return String.format(Locale.US,
                "Cliente [ Nombre= %s, Domicilio= %s, Correo= %s, Ventas= %d, Total=%,.2f ]",
                nombre, domicilio, correo, ventas.size(), getTotal());
    }
}
