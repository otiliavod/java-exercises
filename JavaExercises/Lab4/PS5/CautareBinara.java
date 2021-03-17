/* Scrieti o aplicatie in care se implementeaza algoritmul de 
cautare binara a prezentei unui numar x citit de la tastatura 
intr-un vector sortat crescator. Vectorul se citste de la 
tastatura.*/

package JavaExercises.Lab4.PS5;
import java.util.*;

public class CautareBinara {
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

        System.out.print("Dati numarul pe care il cautam in vector x = ");
        int x = sc.nextInt();
        if(estePrezent(x, a, 0, N-1)) {
            System.out.println("Este prezent");
        }
        else {
            System.out.println("Nu este prezent");
        }

        sc.close();
    }

    public static boolean estePrezent(int x, int a[], int s, int d) {
        if(s > d) {
            return false;
        }

        if(s == d) {
            if(x == a[s]) {
                return true;
            }
            else {
                return false;
            }
        }

        int m;
        m = (s + d) / 2;
        if(x == a[m]) {
            return true;
        }
        else if(x < a[m]) {
            return estePrezent(x, a, s, m-1);
        }
        else {
            return estePrezent(x, a, m+1, d);
        }
    }
}
