// Genera dos listas aleatorias y las suma en una tercera lista

import java.util.ArrayList;
import java.util.Random;

void Mostrar(ArrayList<Float> nums) {
    for(float n : nums) System.out.printf("%.2f ", n);
    System.out.println();
}
void GeneraAleatorio(ArrayList<Float> nums, int cantidad) {
    float min=10.5f, max=41.5f;
    Random rnd = new Random();
    for(int i=0; i<cantidad; i++)
    nums.add(rnd.nextFloat(max-min)+min);
}
void SumaListas(ArrayList<Float> a1,
    ArrayList<Float> a2, ArrayList<Float> a3) {
    for(int i=0; i<a1.size(); i++)
    a3.add(a1.get(i)+a2.get(i));
}
void main() {
    int MAX=15;
    ArrayList<Float> A = new ArrayList<>();
    ArrayList<Float> B = new ArrayList<>();
    ArrayList<Float> C = new ArrayList<>();
    System.out.print("\033[H\033[2J"); System.out.flush();
    GeneraAleatorio(A, MAX);
    GeneraAleatorio(B, MAX);
    System.out.println("Lista A:"); Mostrar(A);
    System.out.println("Lista B:"); Mostrar(B);
    SumaListas(A,B,C);
    System.out.println("Suma de A y B:"); Mostrar(C);
}