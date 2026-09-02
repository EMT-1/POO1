//Imprime los numeros n de la serie de Fibonacci

package Practica_4;

import java.util.Scanner;

public class p051_SerieFibonaci {
    public static void main(String[] args) {
        int n, a, b, c;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.printf("Imprime los primeros n números de la serie de Fibonacci \n");
            System.out.print(">>> ¿Numero de terminos que deseas imprimir?: "); n = obj.nextInt();
            System.out.printf("\nLos primeros " + n + " números de la serie de Fibonacci son: \n", n);
            a = 0; b = 1;
            if (n >= 1) {
                System.out.printf("%d ", a);
            }
            if (n >= 2) {
                System.out.printf("%d ", b);
            }
            for (int i = 3; i <= n; i++) {
                c = a + b;
                System.out.printf("%d ", c);
                a = b;
                b = c;
            }
            System.out.print("\nDeseas continuar (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0));
        } while( resp != 'N' );
        System.out.println("\nGracias por utilizar este programa !");
        obj.close();
    }
}
