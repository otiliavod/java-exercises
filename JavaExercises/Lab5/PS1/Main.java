/* Citim de la tastatura numarul de linii si numarul de coloane
ale unei matrici. Initializam matricea cu numere aleatare in 
gama 0...100. Afisam aceasta matrice si apoi calculam si afisam
maximul din matrice.*/

package JavaExercises.Lab5.PS1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numarul de linii: ");
        int nL = sc.nextInt();
        System.out.print("Numarul de coloane: ");
        int nC = sc.nextInt();

        int a[][] = new int[nL][nC];
        final int GAMA = 100;
        Random r = new Random();

        for(int i=0; i<nL; i++) {
            for(int j=0; j<nC; j++) {
                a[i][j] = r.nextInt(GAMA);
            }
        }
        
        int max = a[0][0];
        for(int i=0; i<nL; i++) {
            for(int j=0; j<nC; j++) {
                if(a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }

        for(int i=0; i<nL; i++) {
            for(int j=0; j<nC; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maximul: " + max);
        sc.close();
    }    
}
