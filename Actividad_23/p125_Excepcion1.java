package Actividad_23;

public class p125_Excepcion1 {
    public static void main(String[]args) {
        int a = 100;
        int b = 0;
        try {
            int resultado = a / b;
            System.out.println(resultado);
        }   
        catch (ArithmeticException e) {
            System.out.println( "El denominador no puedeser 0" );
        }
    }
}