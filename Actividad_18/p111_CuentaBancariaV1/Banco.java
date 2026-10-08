package Actividad_18.p111_CuentaBancariaV1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {
    private String nombre;
    private String domicilio;
    private final List<Cliente> clientes;

    public Banco() {
        clientes = new ArrayList<>();
    }

    public Banco(String nombre, String domicilio) {
        this();
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    public void agregarCliente(Cliente cliente) {
        if (cliente == null)
            throw new IllegalArgumentException("Cliente");
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return Collections.unmodifiableList(clientes);
    }

    @Override
    public String toString() {
        return nombre + ", " + domicilio + ": clientes=" + clientes.size();
    }
}