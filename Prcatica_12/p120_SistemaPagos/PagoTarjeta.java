package Prcatica_12.p120_SistemaPagos;

public class PagoTarjeta implements MetodoPago {

    private double comision; // expresada como decimal, ej. 0.03 = 3%

    public PagoTarjeta(double comision) {
        this.comision = comision;
    }

    @Override
    public double calcularTotal(double monto) {
        return monto + (monto * comision);
    }

    @Override
    public String getDescripcion() {
        return "Pago con tarjeta";
    }
} 