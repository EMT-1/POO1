//Le damos tres umeros enteros y nos verifica si son consecutivos o no

package Practica_3;

import java.util.Scanner;

public class p033_NumerosConsecutivos {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Introduce tres números: ");
        n1 = obj.nextInt();
        n2 = obj.nextInt();
        n3 = obj.nextInt();
        if (n2 == n1 + 1 && n3 == n2 + 1) {
            System.out.println("Los números son consecutivos.");
        } else {
            System.out.println("Los números no son consecutivos.");
        }
        obj.close();
    }
}
