package Actividad_18.p111_CuentaBancariaV1;

public class Cliente {
    private String nombre;
    private final CuentaBancaria cuenta;

    public Cliente(String nombre, CuentaBancaria cuenta) {
        if (cuenta == null)
            throw new IllegalArgumentException("Cuenta");
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    @Override
    public String toString() {
        return nombre + ": saldo=" + cuenta.getSaldo();
    }
}