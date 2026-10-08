package Actividad_18.p111_CuentaBancariaV1;

public class CuentaBancaria {
    private double saldo;
    public CuentaBancaria(double cantidad) {
        if (!Double.isFinite(cantidad) || cantidad < 0)
        throw new IllegalArgumentException("Saldo");
        saldo = cantidad;
    }
    public double getSaldo() { return saldo; }
    public void deposita(double cantidad) {
        if (!Double.isFinite(cantidad) || cantidad <= 0)
        throw new IllegalArgumentException("Deposito");
        saldo += cantidad;
    }
    public boolean retira(double cantidad) {
        if (!Double.isFinite(cantidad) || cantidad <= 0
        || cantidad > saldo) return false;
        saldo -= cantidad;
        return true;
    }
}
