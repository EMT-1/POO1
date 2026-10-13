package Actividad_20.p113_CuentaBancariaV3;

public abstract class CuentaBancaria { // esta clase no puede tener  obetos de ella
    private double Saldo; // permite que la clase hija accesa al Saldo
    public CuentaBancaria(double cantidad) {
        if(cantidad>0) Saldo = cantidad;
        else throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
    }
    public double getSaldo() { return Saldo; }
    public void actualizarSaldo(double saldo) {
        Saldo = saldo;
    }
    public void depositar(double cantidad) {
        if(cantidad>0) Saldo += cantidad;
        else throw new IllegalArgumentException("El deposito no puede ser negativo");
    }
    public abstract boolean retirar(double cantidad); // se debe implementar en las clases hijas
    @Override
    public String toString() {
        return getClass().getSimpleName()
        + ": saldo=" + getSaldo();
    }
}