/* Se citesc de la tastatura un numar natural N si un numar natual
p. Se citeste o multime de N numere intregi intr-un vector a. Sa
se afiseze toate grupele de p elemente luate din cele N care 
contin un singur numar par.*/

package JavaExercises.Lab4.PS6;
import java.util.*;

public class GenerareGrupe {
    public static void main(String[] args) {
        int N, p;
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        N = sc.nextInt();
        System.out.print("p = ");
        p = sc.nextInt();

        int a[] = new int[N];
        for(int i=0; i<N; i++) {
            System.out.print("nr = ");
            a[i] = sc.nextInt();
        }

        int X[] = new int[p];
        back(a, N, p, X, 0);

        sc.close();
    }

    private static void back(int a[], int N, int p, int X[], int k) {
        if(k == p) {
            verificareSiAfisare(X);
        }
        else {
            for (int i=0; i<N; i++) {
                X[k] = a[i];
                if(valid(X, k)) {
                    back(a, N, p, X, k+1);
                }
            }
        }
    }

    private static boolean valid(int X[], int k) {
        if(k == 0) {
            return true;
        }

        if(X[k] > X[k-1]) {
            return true;
        }
        else {
            return false;
        }
    }

    private static void verificareSiAfisare(int X[]) {
        int contor = 0;
        for(int i=0; i<X.length; i++) {
            if(X[i] % 2 == 0) {
                contor ++;
            }
        }

        if(contor != 1) {
            return;
        }

        for(int i=0; i<X.length; i++) {
            System.out.print(X[i] + " ");
        }
        System.out.println();
    }
}
