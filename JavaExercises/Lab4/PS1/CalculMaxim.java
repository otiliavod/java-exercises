/* Citim un numar natural N. Citim N numere intregi intr-un vector
a. Sa se calculeze si afiseze maximul din vector.*/

package JavaExercises.Lab4.PS1;
import java.util.*;

public class CalculMaxim {
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
        int max = a[0];
        for(int i=1; i<N; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
        sc.close();
    }
}
