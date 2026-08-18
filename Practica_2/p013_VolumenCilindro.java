// Calcula el volumen de un cilindro dado su radio y altura

package Practica_2;

import java.util.Scanner;

public class p013_VolumenCilindro {
    public static void main(String[] args) {
        System.out.println("Este programa calcula el volumen de un cilindro dados su radio y altura");
        double radio, altura, volumen;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame el radio: ");
        radio = scan.nextDouble();
        System.out.println("Dame la altura: ");
        altura = scan.nextDouble();
        volumen = Math.PI * (radio * radio) * altura;
        System.out.println("Volumen: " + volumen);
        scan.close();
    }
}
