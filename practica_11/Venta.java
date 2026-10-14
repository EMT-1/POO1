import java.util.Locale;

public abstract class Venta {
    protected String articulo;
    protected double cantidad;
    protected double precio;
    protected double total;

    public Venta(String articulo, double cantidad, double precio) {
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = cantidad * precio;
    }

    public abstract double getTotalVenta();

    @Override
    public String toString() {
        return String.format(Locale.US,
                "Venta [Articulo= %s, Cantidad= %.1f, Precio= %,.2f, Total= %,.2f]",
                articulo, cantidad, precio, total);
    }
}
