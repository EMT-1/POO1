/**
 * Camión de carga. Hereda de Vehiculo e implementa su propio bono.
 * Bono = (CostoBase * 0.10) + (Ejes * 50) + (Kilometraje * 0.5)
 */
public class CamionCarga extends Vehiculo {

    private int ejes;
    private double kilometraje;

    public CamionCarga(String marca, String modelo, int capacidad,
                       double costoBase, int ejes, double kilometraje) {
        super(marca, modelo, capacidad, costoBase);
        this.ejes = ejes;
        this.kilometraje = kilometraje;
        // Cálculo del costo total usando el bono polimórfico
        setCostoTotal(getCostoBase() + getBonoConductor());
    }

    @Override
    public double getBonoConductor() {
        return (getCostoBase() * 0.10) + (ejes * 50) + (kilometraje * 0.5);
    }

    // ---------- Getters / Setters ----------
    public int getEjes() { return ejes; }
    public void setEjes(int ejes) { this.ejes = ejes; }

    public double getKilometraje() { return kilometraje; }
    public void setKilometraje(double kilometraje) { this.kilometraje = kilometraje; }

    @Override
    public String toString() {
        return String.format(
            "CamionCarga [%s, Ejes=%d, Kilometraje=%.1f, Bono=%.1f, CostoTotal=%.1f]",
            super.toString(), ejes, kilometraje, getBonoConductor(), getCostoTotal()
        );
    }
}
