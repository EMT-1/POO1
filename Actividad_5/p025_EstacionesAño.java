// Muestra la estación del año que corresponde al número introducido

package Actividad_5;

import java.util.Scanner;

public class p025_EstacionesAño {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Muestra la estacion del año en base al número:\n");
        System.out.print("Dame un numero (1..4) ? ");
        // int n = new Scanner(System.in).nextInt();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1) System.out.println("Primavera");
        if(n==2) System.out.println("Verano");
        if(n==3) System.out.println("Otoño");
        if(n==4) System.out.println("Invierno");
        if (n<1 || n>4) System.out.println("Error: el número debe estar entre 1 y 4");
        System.out.println("\nProceso terminado ....");
        sc.close();
    }
}