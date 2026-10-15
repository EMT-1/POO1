/**
 * Autobús de pasajeros. Hereda de Vehiculo e implementa su propio bono.
 * Bono = (CostoBase * 0.15) + (Rutas * 120) + (PasajerosTransportados * 0.1)
 */
public class AutobusPasajeros extends Vehiculo {

    private int rutas;
    private int pasajerosTransportados;

    public AutobusPasajeros(String marca, String modelo, int capacidad,
                            double costoBase, int rutas, int pasajerosTransportados) {
        super(marca, modelo, capacidad, costoBase);
        this.rutas = rutas;
        this.pasajerosTransportados = pasajerosTransportados;
        setCostoTotal(getCostoBase() + getBonoConductor());
    }

    @Override
    public double getBonoConductor() {
        return (getCostoBase() * 0.15) + (rutas * 120) + (pasajerosTransportados * 0.1);
    }

    // ---------- Getters / Setters ----------
    public int getRutas() { return rutas; }
    public void setRutas(int rutas) { this.rutas = rutas; }

    public int getPasajerosTransportados() { return pasajerosTransportados; }
    public void setPasajerosTransportados(int pasajerosTransportados) {
        this.pasajerosTransportados = pasajerosTransportados;
    }

    @Override
    public String toString() {
        return String.format(
            "AutobusPasajeros [%s, Rutas=%d, PasajerosTransportados=%d, Bono=%.1f, CostoTotal=%.1f]",
            super.toString(), rutas, pasajerosTransportados,
            getBonoConductor(), getCostoTotal()
        );
    }
}