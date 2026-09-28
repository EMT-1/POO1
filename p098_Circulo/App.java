import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Una sola entrada de datos
        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        // Creamos el círculo con el radio ingresado
        Circulo c = new Circulo(radio);

        // Mostramos resultados
        System.out.println(c);
        System.out.println("El radio es : " + c.getRadio());
        System.out.println("Area = " + c.getArea());
        System.out.println("Circunferencia = " + c.getCircunferencia());

        sc.close();
    }
}