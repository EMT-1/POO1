// Calcular la paga de un trabajador, las horas extra se pagan al doble

package Actividad_4;

import java.util.Scanner;

public class p024_PagaTrabajadorv2 {
    public static void main(String[] args) {
        int horas, extra;
        float paga, total;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Calculando la paga de un trabajador \n");
        System.out.print("Dame las horas ? "); horas = obj.nextInt();
        System.out.print("Dame la paga ? "); paga = obj.nextFloat();

        if( horas > 40 ) {
            extra = horas - 40;
            total = (40*paga) + (extra * paga * 2);
            System.out.printf("\nHoras extra: %d", extra);
            System.out.printf("\nPago total: %.2f", total);
        }

        else{
            total = horas * paga;
            System.out.printf("\nPago total: %.2f", total);
        }

        obj.close();
    }
}
