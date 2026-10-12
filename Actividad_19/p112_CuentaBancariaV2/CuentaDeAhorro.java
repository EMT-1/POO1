public class CuentaDeAhorro extends CuentaBancaria {
    private final double tasaInteres;
    public CuentaDeAhorro(double cantidad, double
    tasa) {
        super(cantidad);
        if( tasa >= 0 && tasa <= 1)
        tasaInteres = tasa;
        else throw new IllegalArgumentException("Tasa");
    }
    public double getTasa() {
        return tasaInteres;
    }
    public void calcularInteres() {
        Saldo += Saldo * tasaInteres;
    }
    @Override
    public boolean retira(double cantidad) {
        if( cantidad>0 && Saldo >= cantidad) {
            Saldo -= cantidad;
            return true;
        }
        else return false;
    }
}