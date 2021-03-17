/* Pentru un vector de numere intregi dat, sa i se inverseze
elementele, astfel: primul devine ultimul, al doilea devine
penultimul, etc.*/

package JavaExercises.Lab4.PS4;
import java.util.*;

public class Inversare {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        N = sc.nextInt();

        int a[] = new int[N];
        for(int i=0; i<N; i++) {
            System.out.print("nr = ");
            a[i] = sc.nextInt();
        }

        inversareVector(a);

        for(int i=0; i<N; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }

    public static void inversareVector(int a[]) {
        for(int i = 0; i<a.length/2; i++) {
            int aux = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = aux;
        }
    }
}
