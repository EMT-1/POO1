//Envia un saludo a la pantalla

package Actividad_1;

public class p001_HolaMundo {
    public static void main(String[] args) {
        String amigo = "Adrian";
        String hermano = "Reynaldo";
        String mensage = String.format("Tanto %s como %s desean aprender java", amigo, hermano);

        System.out.println("Hola Mundo en el lenguaje java");
        System.out.println("\nHola amigo " + amigo + " bienvenido a java");
        System.out.println("\nMi amigo es " + amigo + " mi hermano es " + hermano);
        System.out.println("\n" + mensage);
    }
}
