/* Se citeste de la tastatura un numar natural N; se instantiaza
un vector de N numere intregi. Sa se completeze acest vector cu
numere aleatoare in gama 0..N-1, cu conditia ca fiecare numar 
din aceasta gama sa apara doar o data.*/

package JavaExercises.Lab4.PS2;
import java.util.*;

public class InitNumereAleatoare {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        N = sc.nextInt();

        int a[] = new int[N];
        for(int i=0; i<a.length; i++) {
            a[i] = i;
        }

        Random r = new Random();
        for(int i=0; i<N; i++) {
            int n1 = r.nextInt(N);
            int n2 = r.nextInt(N);
            
            int aux = a[n1];
            a[n1] = a[n2];
            a[n2] = aux;
        }

        for(int i=0; i<N; i++) {
            System.out.println(a[i]);
        }
        sc.close();
    }
}
