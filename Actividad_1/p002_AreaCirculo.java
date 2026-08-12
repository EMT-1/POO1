//Calcula el area de un circulo

package Actividad_1;

import java.util.Scanner;

public class p002_AreaCirculo {
    public static void main(String[] args){
        double radio, area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nCalculanddo el area de un circulo\n");  
        System.out.print("\nDame el radio: ");

        radio = scanner.nextFloat();
        area = Math.PI * Math.pow(radio, 2);

        System.out.println("\nEl circulo de radio " + radio + " tiene un area de: " + area);

        scanner.close();
    }
}
