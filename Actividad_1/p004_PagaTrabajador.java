//Calcula el pago de un trabajador

package Actividad_1;

import java.util.Scanner;

public class p004_PagaTrabajador {
    public static void main(String[] args){
        String nombre;
        int horas;
        double paga, tasa, impuesto, pagabruta, paganeta;
        Scanner scanner = new Scanner(System.in);
        //Entrada de datos
        System.out.print("\nCalculando el pago de un trabajador\n");
        System.out.print("\nNombre del trabajador: "); nombre = scanner.nextLine();
        System.out.print("\nHoras trabajadas: "); horas = scanner.nextInt();    
        System.out.print("\nPago x hora: "); paga = scanner.nextDouble();
        tasa = 0.03;
        //calculo de pago 
        pagabruta = horas * paga;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;
        //Salida
        System.out.println("\nResumen de pagos\n");
        System.out.println(String.format("El trabajador %s, trabajo %d horas, a una paga de %.2f pesos la hora, con una tasa de impuestos de %.2f", nombre, horas, paga, tasa));
        System.out.println(String.format("El pago bruto es de: %.2f", pagabruta));
        System.out.println(String.format("El impuesto es de: %.2f", impuesto));
        System.out.println(String.format("El pago neto es de: %.2f", paganeta));
        scanner.close();
    }
}
