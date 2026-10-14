import java.util.Locale;

public class VentaCredito extends Venta {
    private double meses;
    private double interes;

    public VentaCredito(String articulo, double cantidad, double precio,
                        double meses, double interes) {
        super(articulo, cantidad, precio);
        this.meses = meses;
        this.interes = interes;
    }

    @Override
    public double getTotalVenta() {
        return total + (total * meses * interes / 100.0);
    }

    @Override
    public String toString() {
        return String.format(Locale.US,
                "VentaCredito [%s, Meses= %.1f, Interes= %.2f%%, TotalVenta= %,.2f]",
                super.toString(), meses, interes, getTotalVenta());
    }
}
