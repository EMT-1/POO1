//Se desea calcular el promedio de 5 calificaciones introducidas por el usuario, luego evaluar el resultado e imprimir
//un mensaje de acuerdo con el promedio obtenido:
//● >0 y <= 6 Quedas reprobado
//● >6 a <=7 Pasas de panzazo
//● >7 y <=8 Muy bien, pues mejorar
//● >8 y <=9 Excelente sigue así
//● >9 y <=10 Perfecto tu esfuerzo valió la pena

package Practica_3;

import java.util.Scanner;

public class p037_CalculoNotas {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, nota5, promedio;

        System.out.print("Ingresa 5 calificaciones: ");
        nota1 = obj.nextDouble();
        nota2 = obj.nextDouble();
        nota3 = obj.nextDouble();
        nota4 = obj.nextDouble();
        nota5 = obj.nextDouble();

        promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        System.out.println("Promedio: " + promedio);

        if (promedio > 0 && promedio <= 6) {
            System.out.println("Quedas reprobado.");
        } else if (promedio > 6 && promedio <= 7) {
            System.out.println("Pasas de panzazo.");
        } else if (promedio > 7 && promedio <= 8) {
            System.out.println("Muy bien, pues mejorar.");
        } else if (promedio > 8 && promedio <= 9) {
            System.out.println("Excelente sigue así.");
        } else if (promedio > 9 && promedio <= 10) {
            System.out.println("Perfecto tu esfuerzo valió la pena.");
        } else {
            System.out.println("Promedio no válido.");
        }

        obj.close();
    }
}
