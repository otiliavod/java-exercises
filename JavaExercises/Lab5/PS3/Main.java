/* Se citeste de la tastatura un numar natural N. Sa se copieze
intr-o matrice patrata de dimensiune N, primii N^2 termeni din
sirul lui Fibonacci, apoi sa se afiseze aceasta matrice.*/

package JavaExercises.Lab5.PS3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();

        int a[][] = new int[N][N];
        int pen = 1;
        int ultim = 0;

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                a[i][j] = pen + ultim;
                pen = ultim;
                ultim = a[i][j];
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }    
}
