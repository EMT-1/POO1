public class CuentaDeCheques extends CuentaBancaria {
    private final double LimiteSobregiro;
    public CuentaDeCheques(double cantidad, double
    limite) {
        super(cantidad);
        if (limite > 0) LimiteSobregiro = limite;
        else throw new
        IllegalArgumentException("Limite");
    }
    public double getLimiteSobregiro() {
        return LimiteSobregiro;
    }
    public double getDisponible() {
        return Saldo + LimiteSobregiro;
    }
    @Override
    public boolean retira(double cantidad) {
        if (cantidad >= 0 && cantidad <= getDisponible()) {
            Saldo -= cantidad;
            return true;
        } else return false;
    }
}