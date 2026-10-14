import java.util.Locale;

public class VentaContado extends Venta {
    private double descuento;
    private String regalo;

    public VentaContado(String articulo, double cantidad, double precio,
                        double descuento, String regalo) {
        super(articulo, cantidad, precio);
        this.descuento = descuento;
        this.regalo = regalo;
    }

    @Override
    public double getTotalVenta() {
        return total - (total * descuento / 100.0);
    }

    @Override
    public String toString() {
        return String.format(Locale.US,
                "VentaContado [%s, Descuento= %.2f%%, Regalo= %s, Total= %,.2f]",
                super.toString(), descuento, regalo, getTotalVenta());
    }
}
