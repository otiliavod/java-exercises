/* Se citeste de la tastatura un numar natural N. Se citesc N numere intregi intr-un vector a. Sa se copieze
toate numere din vectorul a intr-o matrice patrata b de dimensiune corespunzatoare. Spatiile eventual neocupate
din matrice se vor completa cu valoarea -1.*/

package JavaExercises.Lab5.P7;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();

        int a[] = new int[N];
        int k;
        for(k=0; k<N; k++) {
            System.out.print("nr = ");
            a[k] = sc.nextInt();
        }

        int b[][] = new int[N/2][N/2];
        for(int i=0; i<N/2; i++) {
            for(int j=0; j<N/2; j++) {
                b[i][j] = a[k];
            }
        }

        for(int i=0; i<N/2; i++) {
            for(int j=0; j<N/2; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
