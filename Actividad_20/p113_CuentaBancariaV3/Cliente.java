package Actividad_20.p113_CuentaBancariaV3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {
    private String nombre;
    private final List<CuentaBancaria> cuentas;
    public Cliente() { cuentas = new ArrayList<>(); }
    public Cliente(String nombre) {
        this();
        this.nombre = nombre;
    }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void agregarCuenta(CuentaBancaria cuenta) {
        if (cuenta == null)
        throw new IllegalArgumentException("Cuenta");
        cuentas.add(cuenta);
    }
    public List<CuentaBancaria> getCuentas() {
        return Collections.unmodifiableList(cuentas);
    }
    public double getTotal() {
        double total = 0;
        for (CuentaBancaria cuenta : cuentas)
        total += cuenta.getSaldo();
        return total;
    }
    @Override
    public String toString() {
        return nombre + ": cuentas=" + cuentas.size()
        + ", total=" + getTotal();
    }
}