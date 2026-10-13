package Actividad_20.p113_CuentaBancariaV3;

public class CuentaDeCheques extends CuentaBancaria {
    private double LimiteSobregiro;
    public CuentaDeCheques(double cantidad, double limite) {
        super(cantidad);
        if(limite>0) LimiteSobregiro = limite;
        else throw new IllegalArgumentException("limite debe ser positivo");
    }
    public double getLimiteSobregiro() {
        return LimiteSobregiro;
    }
    public double getDisponible() {
        return getSaldo() + LimiteSobregiro;
    }
    @Override
    public boolean retirar(double cantidad) {
        if(cantidad>0 && cantidad <= getDisponible() ) {
            actualizarSaldo(getSaldo() - cantidad);
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return super.toString()
        + ", limite=" + getLimiteSobregiro()
        + ", disponible=" + getDisponible();
    }
}
