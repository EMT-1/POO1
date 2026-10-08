package Actividad_18.p111_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {

        // --- Diapositiva 8: Probar Cliente sin duplicar el retiro ---
        CuentaBancaria cuenta1 = new CuentaBancaria(1000);
        Cliente cliente1 = new Cliente("Juan Perez", cuenta1);
        Cliente cliente2 = new Cliente("Carlos Castaneda", new CuentaBancaria(1000));

        boolean retiro2 = cliente2.getCuenta().retira(50);
        System.out.println(retiro2);
        System.out.println(cliente2);

        // --- Diapositiva 10: Probar Banco: registrar y operar ---
        Banco banco = new Banco("Banco Patito", "Arboledas 124");
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);
        Cliente cliente3 = new Cliente("Felipe Correa", new CuentaBancaria(2000));
        banco.agregarCliente(cliente3);
        cliente1.getCuenta().deposita(1500);
        boolean retiro3 = cliente2.getCuenta().retira(1000);
        System.out.println(retiro3);
        cliente3.getCuenta().deposita(12000);

        // --- Diapositiva 11: Probar Banco: recorrer y sumar ---
        double total = 0;
        for (Cliente cliente : banco.getClientes()) {
            System.out.println(cliente);
            total += cliente.getCuenta().getSaldo();
        }
        System.out.println(banco);
        System.out.println("Total=" + total);
    }
}