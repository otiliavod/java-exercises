/* Se citeste de la tastatura un numar natural N. Sa se copieze intr-o matrice patrata de dimensiune N
primele N^2 numere prime, apoi sa se afiseze matricea.*/

package JavaExercises.Lab5.P2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();

        int a[][] = new int[N][N];
        int x = 1;

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(estePrim(x)) {
                    a[i][j] = x;
                }
                x++;
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

    private static boolean estePrim(int nr) {
        for(int i = 2; i <= Math.sqrt(nr); i++) {
            if(nr % i == 0) {
                return false;
            }
        }
        return true;
    } 
}
