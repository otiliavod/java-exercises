/* Citim un numar natural N. Citim N numere intregi intr-un vector
a. Sa se calculeze care este al doilea numar ca marime din vector.*/

package JavaExercises.Lab4.P2;
import java.util.*;

public class Main {
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

        for(int i=0; i<N; i++) {
            if(a[i] == max(a)) {
                for(int j=i; j<N; j++) {
                    a[i] = a[i+1];
                }
                N--;
                int rez = max(a);
                System.out.println(rez);
            }
        }
        sc.close();
    }

    public static int max(int x[]) {
        int maxim = x[0];
        for(int i=1; i<x.length; i++) {
            if(x[i] > maxim) {
                maxim = x[i];
            }
        }
        return maxim;
    }
}
