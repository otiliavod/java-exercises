/* Se citeste de la tastatura un numar natural N. Se citeste o matrice patrata de numere intregi, de dimensiune
N. Sa se calculeze si afiseze cate numere prime sunt in matrice.*/

package JavaExercises.Lab5.P4;
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

        int contor = 0;
        boolean este = true;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                for(int k=2; k<=Math.sqrt(a[i][j]); k++) {
                    if(a[i][j] % k == 0) {
                        este = false;
                        break;
                    }
                }
                if(este) {
                    contor ++;
                }
            }
        }

        System.out.println("Sunt " + contor + " numere prime");
        sc.close();
    }
}
