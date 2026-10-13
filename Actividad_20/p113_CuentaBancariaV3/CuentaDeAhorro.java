package Actividad_20.p113_CuentaBancariaV3;

public class CuentaDeAhorro extends CuentaBancaria { // hereda de CuentaBancaria
    private double tasaInteres;
    public CuentaDeAhorro(double cantidad, double tasa) {
        super(cantidad); // llamada al constructor de la clase base
        if(tasa>=0 && tasa <=1)
        tasaInteres = tasa;
        else throw new IllegalArgumentException("Tasa erronea");
    }
    public double getTasa() {
        return tasaInteres;
    }
    public void calcularInteres() {
        actualizarSaldo(getSaldo() + getSaldo() * tasaInteres);
    }
    @Override
    public boolean retirar(double cantidad) {
        if(cantidad>0 && getSaldo() >= cantidad) {
            actualizarSaldo(getSaldo() - cantidad);
            return true;
        } return false;
    }
    @Override
    public String toString() {
        return super.toString() + ", tasa=" + getTasa();
    }
}