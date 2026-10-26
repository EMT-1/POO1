package Actividad_23;

import java.util.Scanner;

public class p129_Excepcion5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] datos = {10, 20, 30, 40};
        try {
            int posicion = entrada.nextInt();
            System.out.println(datos[posicion]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posición fuera del arreglo");
        }
        finally {
            System.out.println("Contenido:");
            for (int dato : datos) {
                System.out.print(dato + " ");
            }
        }
        entrada.close();
    }
}
