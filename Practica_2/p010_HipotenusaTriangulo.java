// Calcula la hipotenusa de un triángulo rectángulo

package Practica_2;

import java.util.Scanner;

public class p010_HipotenusaTriangulo {
    public static void main(String[] args){
        System.out.println("Este programa calcula la hipotenusa de un triángulo rectángulo dados sus dos lados");
        double cateto1, cateto2, hipotenusa;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el valor del lado 1: ");
        cateto1 = scan.nextDouble();
        System.out.print("Ingrese el valor del lado 2: ");
        cateto2 = scan.nextDouble();
        hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);  
        System.out.println("La hipotenusa es: " + hipotenusa);
        scan.close();   
    }
}
