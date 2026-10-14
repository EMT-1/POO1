import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Tienda {
    private String nombre;
    private String propietario;
    private String domicilio;
    private List<Cliente> clientes;

    public Tienda(String nombre, String propietario, String domicilio) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.domicilio = domicilio;
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public double getTotal() {
        double acumulado = 0.0;
        for (Cliente cliente : clientes) {
            acumulado += cliente.getTotal();
        }
        return acumulado;
    }

    public void reporte(String titulo) {
        System.out.println("\n" + titulo + " : " + this);
        for (Cliente cliente : clientes) {
            System.out.println(">> " + cliente);
            for (Venta venta : cliente.getVentas()) {
                System.out.println(venta);
            }
            if (!cliente.getVentas().isEmpty()) {
                System.out.println();
            }
        }
    }

    @Override
    public String toString() {
        return String.format(Locale.US,
                "Tienda [Nombre= %s, Propietario= %s, Domicilio= %s, Clientes= %d, Total = %,.2f]",
                nombre, propietario, domicilio, clientes.size(), getTotal());
    }
}
