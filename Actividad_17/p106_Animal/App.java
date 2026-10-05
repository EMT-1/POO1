package Actividad_17.p106_Animal;

public class App {
    public static void main(String[] args) {
        Perro perro = new Perro("Max", 3);
        Gato gato = new Gato("Luna", 2);
        System.out.println(perro);
        perro.comer();
        perro.dormir();
        perro.ladrar();
        System.out.println("Edad: " + perro.getEdad());
        System.out.println(gato);
        gato.comer();
        gato.dormir();
        gato.maullar();
        System.out.println("Edad: " + gato.getEdad());
    }
}
