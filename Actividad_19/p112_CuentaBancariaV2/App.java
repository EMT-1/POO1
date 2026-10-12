import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
        cuentas.add(new CuentaDeAhorro(1000, 0.10));
        cuentas.add(new CuentaDeCheques(1000, 500));
        boolean retira;
        System.out.print("\033[H\033[2J");
        System.out.println("\nPrueba cuenta de ahorro:");
        System.out.println("Saldo: " + cuentas.get(0).getSaldo() + " / Tasa: " +
        ((CuentaDeAhorro) cuentas.get(0)).getTasa());
        retira = cuentas.get(0).retira(1200);
        System.out.println("Retira 1200 : " + retira + " / " + cuentas.get(0).getSaldo());
        cuentas.get(0).deposita(500);
        System.out.println("Deposita 500 : " + cuentas.get(0).getSaldo());
        ((CuentaDeAhorro) cuentas.get(0)).calcularInteres();
        System.out.println("Interes %10 : " + cuentas.get(0).getSaldo());
        System.out.println("\nPrueba cuenta de cheques");
        System.out.println("Saldo: " + cuentas.get(1).getSaldo() + " / Limite: " +
        ((CuentaDeCheques) cuentas.get(1)).getLimiteSobregiro() + " / Disponible: " +
        ((CuentaDeCheques) cuentas.get(1)).getDisponible());
        retira = cuentas.get(1).retira(1200);
        System.out.println("Retira 1200 : " + retira + " / " +
        cuentas.get(1).getSaldo());
        retira = cuentas.get(1).retira(400);
        System.out.println("Retira 400 : " + retira + " / " +
        cuentas.get(1).getSaldo());
        cuentas.get(1).deposita(500);
        System.out.println("Deposita 500 : " + cuentas.get(1).getSaldo() + " /
        Disponible: " + ((CuentaDeCheques) cuentas.get(1)).getDisponible());
        }
}