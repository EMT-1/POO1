
public abstract class CuentaBancaria {
    private double Saldo;
    public CuentaBancaria(double cantidad) {
        if(cantidad>0) Saldo = cantidad;
        else throw new
        IllegalArgumentException("cantidad negativa");
    }
    public double getSaldo() { return Saldo; }
    public void deposita(double cantidad) {
        if(cantidad>0) Saldo += cantidad;
        else throw new
        IllegalArgumentException("cantidad negativa");
    }
    public abstract boolean retira(double cantidad);
}