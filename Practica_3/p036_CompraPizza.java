//Un usuario puede elegir un tamaño de pizza (chica - $5, mediana $10, grande $20), luego elige la cantidad, si la
//compra es menor a 2000 no tiene descuento, mayor a 2000 tiene un descuento de 15%. Diseñe un programa que
//permita procesar la solicitud e imprimir: tamaño de la compra, cantidad comprada, total compra, descuento, total de
//compra con descuento.

package Practica_3;

import java.util.Scanner;

public class p036_CompraPizza {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int tamaño, cantidad;
        double totalCompra, descuento, totalConDescuento;

        System.out.print("Tamaño (1: chica, 2: mediana, 3: grande): ");
        tamaño = obj.nextInt();
        System.out.print("Cantidad: ");
        cantidad = obj.nextInt();

        switch (tamaño) {
            case 1:
                totalCompra = cantidad * 5;
                break;
            case 2:
                totalCompra = cantidad * 10;
                break;
            case 3:
                totalCompra = cantidad * 20;
                break;
            default:
                System.out.println("Tamaño no válido.");
                obj.close();
                return;
        }

        if (totalCompra > 2000) {
            descuento = totalCompra * 0.15;
            totalConDescuento = totalCompra - descuento;
        } else {
            descuento = 0;
            totalConDescuento = totalCompra;
        }

        System.out.println("Total de la compra: $" + totalCompra);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total de la compra con descuento: $" + totalConDescuento);

        obj.close();
    }
}
