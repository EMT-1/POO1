package Prcatica_12.p120_SistemaPagos;

public class App {
    public static void main(String[] args) {
        double monto = 1000.00;

        MetodoPago tarjeta = new PagoTarjeta(0.03);       // 3% de comisión
        MetodoPago transferencia = new PagoTransferencia(15.00);

        System.out.printf("%s: $%.2f%n",
                tarjeta.getDescripcion(), tarjeta.calcularTotal(monto));
        System.out.printf("%s: $%.2f%n",
                transferencia.getDescripcion(), transferencia.calcularTotal(monto));
    }
}