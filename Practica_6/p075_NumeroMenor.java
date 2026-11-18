package Practica_6;

import java.util.Scanner;


public class p075_NumeroMenor {

    public static int numeroMenor() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce 4 números: ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();

        int menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;
        if (d < menor) menor = d;
        return menor;
    }

    public static void main(String[] args) {
        int menor = numeroMenor();
        System.out.println("El número menor es: " + menor);
    }
}