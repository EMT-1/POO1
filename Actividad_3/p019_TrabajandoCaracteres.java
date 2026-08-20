// Trabajando con caracteres

package Actividad_3;

public class p019_TrabajandoCaracteres {
    public static void main(String[] args) {
        char c1 = 'A', c2 = 'B';
        char numero = '9';
        char arroba = '@';
        char pesos = 36;
        char corazon = '\u2665';
        char letraw = 119;
        char espacio = ' ';

        // Limpieza de pantalla
        System.out.print("\\033[H\\033[2J"); System.out.flush();
        System.out.println(c1);
        System.out.println(corazon); // ♥

        // Aritmética de caracteres
        c1++; c2++; numero--;
        System.out.println(c1); // 'B'
        
        // Métodos de la clase Character
        System.out.println(Character.isLetter(c1)); // True
        System.out.println(Character.isDigit(numero)); // True
        System.out.println(Character.isAlphabetic(pesos)); // False
        System.out.println(Character.isSpaceChar(espacio)); // True
    }
}
