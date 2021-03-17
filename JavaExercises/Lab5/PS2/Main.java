/* Se citeste o matrice de numere intregi de la tastatura. Sa
se calculeze si afiseze cate linii din matrice au toate elementele
egale intre ele.*/

package JavaExercises.Lab5.PS2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numarul de linii: ");
        int nL = sc.nextInt();
        System.out.print("Numarul de coloane: ");
        int nC = sc.nextInt();

        int a[][] = new int[nL][nC];
        for(int i=0; i<nL; i++) {
            for(int j=0; j<nC; j++) {
                System.out.print("nr = ");
                a[i][j] = sc.nextInt();
            }
        }

        int contor = 0;
        for(int i=0; i<nL; i++) {
            boolean are = true;
            for(int j=1; j<nC; j++) {
                if(a[i][j] != a[i][0]) {
                    are = false;
                    break;
                }
            }
            if(are == true) {
                contor ++;
            }
        }

        System.out.println("Sunt " + contor + " linii");
        sc.close();
    }
}
