//Calcula el area de un triangulo

package Actividad_1;

import java.util.Scanner;

public class p003_AreaTriangulo {
    public static void main(String[] args){
     int base, altura;
     double area;
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("\nCalculando el area de un triangulo\n");
     System.out.print("\nDame la base: ");
     base = scanner.nextInt();
     System.out.print("\nDame la altura: ");
     altura = scanner.nextInt();
     area = (base * altura) / 2.0;
     System.out.println( String.format("\nEl triangulo de base %d y altura %d tiene un area de: %.2f", base, altura, area));
     scanner.close();
    }
}
