package Actividad_20.p113_CuentaBancariaV3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {
    private String Nombre;
    private String Domicilio;
    private final List<Cliente> clientes;
    public Banco() { clientes = new ArrayList<>(); }
    public Banco(String nombre, String domicilio) {
        this();
        Nombre= nombre;
        Domicilio = domicilio;
    }
    public void agregarCliente(Cliente cliente) {
        if (cliente == null)
        throw new IllegalArgumentException("Cliente");
        clientes.add(cliente);
    }
    public List<Cliente> getClientes() {
        return Collections.unmodifiableList(clientes);
    }
    public double getTotal() {
        double total = 0;
        for (Cliente cliente : clientes)
        total += cliente.getTotal();
        return total;
    }
    public void reporteCliente(Cliente cliente) {
        if (cliente == null || !clientes.contains(cliente))
        throw new IllegalArgumentException("Cliente ajeno");
        System.out.println(cliente);
        for (CuentaBancaria cuenta : cliente.getCuentas())
        System.out.println(" " + cuenta);
    }
    public void reporte() {
        System.out.println(this);
        for (Cliente cliente : clientes)
        reporteCliente(cliente);
    }
    public void calcularInteres() {
        for (Cliente cliente : clientes)
        for (CuentaBancaria cuenta : cliente.getCuentas())
        if (cuenta instanceof CuentaDeAhorro)
        ((CuentaDeAhorro) cuenta).calcularInteres();
    }
    @Override
    public String toString() {
        return Nombre + ", " + Domicilio
        + ": clientes=" + clientes.size()
        + ", total=" + getTotal();
    }
}