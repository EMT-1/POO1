// Imprime numeros impares ascendente hasta n

package Practica_4;

import java.util.Scanner;

public class p048_ImparesAscendente {
    public static void main(String[] args) {
        int n,c,s;
        double p;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.printf("Imprime números impares ascendente hasta n \n");
            System.out.print(">>> Introduce el número n: "); n = obj.nextInt();
            System.out.print("\nLos números impares entre 1 y " + n + " son: ");
            s=0;c=1;
            while( c<=n ) {
                System.out.printf("%d ",c);
                s = s + c;
                c = c+2;
            }
            p = s / (n/2 + n%2);
            System.out.printf("\nLa suma es %d",s);
            System.out.printf("\nEl promedio es %.2f",p);
            System.out.print("\nDeseas continuar (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0));
        } while( resp != 'N' );
        System.out.println("\nGracias por utilizar este programa !");
        obj.close();
    }
}
