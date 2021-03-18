/* Se citeste de la tastatura o matrice de numere intregi, de
dimensiuni cunoscute. Se citesc in variabilele lin1 si lin2 numerele
a doua linii din matrice. Sa se comute in matrice aceste doua linii
intre ele.*/

package JavaExercises.Lab5.P1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numar linii: ");
        int nL = sc.nextInt();
        System.out.print("Numar coloane: ");
        int nC = sc.nextInt();

        int a[][] = new int[nL][nC];
        for(int i=0; i<nL; i++) {
            for(int j=0; j<nC; j++) {
                System.out.print("nr = ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("lin1: ");
        int lin1 = sc.nextInt();
        System.out.print("lin2: ");
        int lin2 = sc.nextInt();

        int aux;

        for(int i=0; i<nL; i++) {
            for(int j=0; j<nC; j++) {
                aux = a[lin1][j];
                a[lin1][j] = a[lin2][j];
                a[lin2][j] = aux;
            }
        }

        for(int i=0; i<nL; i++) {
            for(int j=0; j<nC; j++) {
                System.out.println(a[i][j]);
            }
        }

        sc.close();
    }
}
