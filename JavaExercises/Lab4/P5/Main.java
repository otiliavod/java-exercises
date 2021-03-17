/* Citim un numar natural N. Citim N numere intregi intr-un vector a. Sa se calculeze si afiseze care
este numarul par care apare de cele mai multe ori in vector.*/

package JavaExercises.Lab4.P5;
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

        int contor[] = new int[N];
        for(int i=0; i<N; i++) {
            contor[i] = 0;
        }

        for(int i=0; i<N; i++) {
            if(a[i] % 2 == 0) {
                contor[a[i]] = contor[a[i]] + 1;
            }
        }

        int max = contor[0];
        int val = 0;
        for(int i=1; i<N; i++) {
            if(contor[i] > max) {
                max = contor[i];
                val = i;
            }   
        }

        System.out.println(val + " apare de " + max + " ori");
        sc.close();
    }
}
