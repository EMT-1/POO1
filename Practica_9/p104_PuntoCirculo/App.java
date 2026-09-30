public class App {
    public static void main(String[] args) {
        // 1. Crear el primer círculo (Circulo 1)
        // Datos según la salida esperada: Centro X=5, Y=8, Radio=6.0
        Punto punto1 = new Punto(5, 8);
        Circulo circulo1 = new Circulo(punto1, 6.0);

        // 2. Crear el segundo círculo (Circulo 2)
        // Datos según la salida esperada: Centro X=30, Y=46, Radio=2.0
        Punto punto2 = new Punto(30, 46);
        Circulo circulo2 = new Circulo(punto2, 2.0);

        // 3. Mostrar información de los círculos (toString)
        System.out.println(circulo1.toString());
        System.out.println(circulo2.toString());

        // 4. Calcular y mostrar Área del Círculo 1
        System.out.println("Circulo 1 Area           : " + circulo1.getArea());

        // 5. Calcular y mostrar Circunferencia del Círculo 1
        System.out.println("Circulo 1 Circunferencia : " + circulo1.getCircunferencia());

        // 6. Mostrar el centro del Círculo 1 (usando toString de Punto)
        System.out.println("Circulo 1 Centro         : " + circulo1.getCentro().toString());

        // 7. Calcular y mostrar la distancia entre el centro del Círculo 1 y el centro del Círculo 2
        double distancia = circulo1.getCentro().getDistancia(circulo2.getCentro());
        System.out.println("Distancia a Circulo 2    : " + distancia);
    }
}