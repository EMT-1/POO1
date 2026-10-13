package Actividad_20.p113_CuentaBancariaV3;

import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
        cuentas.add(new CuentaDeAhorro(1000, 0.10));
        cuentas.add(new CuentaDeCheques(1000, 500));
        CuentaBancaria ahorro = cuentas.get(0);
        CuentaBancaria cheques = cuentas.get(1);
        Banco banco =
        new Banco("Banco del Norte", "Cumbres 123");
        Cliente carlos = new Cliente("Carlos Fuentes");
        Cliente juan = new Cliente("Juan Perez");
        Cliente maria = new Cliente("Maria Vazquez");
        for (CuentaBancaria cuenta : cuentas)
        carlos.agregarCuenta(cuenta);
        juan.agregarCuenta(new CuentaDeAhorro(2000, 0.05));
        juan.agregarCuenta(new CuentaDeCheques(500, 200));
        banco.agregarCliente(carlos);
        banco.agregarCliente(juan);
        banco.agregarCliente(maria);
        System.out.println("=== REPORTE INICIAL ===");
        banco.reporte();
        boolean retiro = ahorro.retirar(1200);
        System.out.println("Ahorro retira=" + retiro);
        ahorro.depositar(500);
        retiro = cheques.retirar(1200);
        System.out.println("Cheques retira=" + retiro);
        System.out.println("=== CARLOS CON DEUDA ===");
        banco.reporteCliente(carlos);
        retiro = cheques.retirar(400);
        System.out.println("Cheques retira=" + retiro);
        cheques.depositar(500);
        System.out.println("=== TRAS MOVIMIENTOS ===");
        banco.reporte();
        banco.calcularInteres();
        System.out.println("=== TRAS INTERESES ===");
        banco.reporte();
        System.out.println("=== REPORTE DE CARLOS ===");
        banco.reporteCliente(carlos);
    }
}
