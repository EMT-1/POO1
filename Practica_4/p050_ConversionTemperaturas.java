//Convierte grados centigrados en fahrenheit

package Practica_4;

import java.util.Scanner;

public class p050_ConversionTemperaturas {
    public static void main(String[] args) {
        double c1,c2, f;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.printf("Convierte grados centigrados en fahrenheit \n");
            System.out.print(">>> Temperatura inicial: "); c1 = obj.nextDouble();
            System.out.print(">>> Temperatura final: "); c2 = obj.nextDouble();
            System.out.printf("\nCentigrados\tFahrenheit\n");
            while( c1<=c2 ) {
                f = (c1 * 9/5) + 32;
                System.out.printf("%.1f\t\t%.2f\n",c1,f);
                c1++;
            }
            System.out.print("\nDeseas continuar (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0));
        } while( resp != 'N' );
        System.out.println("\nGracias por utilizar este programa !");
        obj.close();
    }
}
