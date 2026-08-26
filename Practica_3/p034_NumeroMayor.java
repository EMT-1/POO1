//De tres numeros enteros verifica cual es el  ayor

package Practica_3;

import java.util.Scanner;

public class p034_NumeroMayor {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Introduce tres números: ");
        n1 = obj.nextInt();
        n2 = obj.nextInt();
        n3 = obj.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("El número mayor es: " + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("El número mayor es: " + n2);
        } else {
            System.out.println("El número mayor es: " + n3);
        }
        obj.close();
    }
}
