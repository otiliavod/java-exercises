/* Citim un numar natural N. Citim N numere intregi intr-un vector a. Sa se calculeze si afiseze toate
perechile de numere prime intre ele, din vector.*/

package JavaExercises.Lab4.P3;
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
            if(suntPrime(a[i], a[i+1])) {
                System.out.println(a[i] + " " + a[i+1]);
            }
            else {
                System.out.println("Nu sunt perechi de numere prime intre ele");
            }
        }
        sc.close();
    }

    public static boolean suntPrime(int x, int y) {
        while(x != y) {
            if(x > y) {
                x = x - y;
            }
            else {
                y = y - x;
            }
        }
        if(x == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}
