// Muestra una lista y eleva sus elementos al cuadrado

import java.util.ArrayList;
import java.util.List;


void Mostrar(ArrayList<Integer> a) {
    for(int i=0; i<a.size(); i++)
        System.out.print(a.get(i) + " ");
}

void Cuadrado(ArrayList<Integer> a) {
    for(int i=0; i<a.size(); i++)
        a.set(i, a.get(i) * a.get(i));
}

void main() {
    ArrayList<Integer> A = new ArrayList<>(
        List.of(2, 4, 6, 8, 3, 5, 7));
    
    System.out.println("\nElementos de la lista A:");
    Mostrar(A);
    System.out.println("\nElementos de A al cuadrado:");
    Cuadrado(A);
    Mostrar(A);
}