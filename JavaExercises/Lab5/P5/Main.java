/* Se citeste de la tastatura un numar natural N. Se citeste o matrice patrata de numere intregi, de dimensiune
N. Sa se calculeze si afiseze care linie din matrice contine cele mai multe numere prime.*/

package JavaExercises.Lab5.P5;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();

        int a[][] = new int[N][N];
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                System.out.print("nr = ");
                a[i][j] = sc.nextInt();
            }
        }

        int contor[] = new int[N];
        for(int i=0; i<N; i++) {
            boolean este = true;
            for(int j=1; j<N; j++) {
                for(int k=2; k<=Math.sqrt(a[i][j]); k++) {
                    if(a[i][j] % k == 0) {
                        este = false;
                        break;
                    }
                }
                if(este) {
                    contor[i] = a[i][j];
                }
            }
        }

        int max = contor[0];
        int l = 0;
        for(int i=0; i<N; i++) {
            if(contor[i] > max) {
                max = contor[i];
                l = i;
            }
        }

        System.out.println("Linia cu cele mai multe numere prime este: " + l);
        sc.close();
    }
}
