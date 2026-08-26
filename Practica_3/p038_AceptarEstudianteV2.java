//Dado el nombre del estudiante, sexo (h/m), su edad y tres calificaciones, decidir si el estudiante es aceptado. La
//Universidad Kitty Kat SA es solo para mujeres mayores de 21 años con un promedio de entre 8 y 9.5.

package Practica_3;

import java.util.Scanner;

public class p038_AceptarEstudianteV2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String nombre;
        char sexo;
        int edad;
        double cal1, cal2, cal3, promedio;

        System.out.print("Ingresa el nombre del estudiante: ");
        nombre = obj.nextLine();
        System.out.print("Ingresa el sexo (h/m): ");
        sexo = obj.next().charAt(0);
        System.out.print("Ingresa la edad: ");
        edad = obj.nextInt();
        System.out.print("Ingresa las tres calificaciones: ");
        cal1 = obj.nextDouble();
        cal2 = obj.nextDouble();
        cal3 = obj.nextDouble();

        promedio = (cal1 + cal2 + cal3) / 3;

        if (sexo == 'm' && edad > 21 && promedio >= 8 && promedio <= 9.5) {
            System.out.println("Resultado: Estudiante aceptada.");
        } else {
            System.out.println("El estudiante " + nombre + " no es aceptado.");
        }

        obj.close();
    }
}
