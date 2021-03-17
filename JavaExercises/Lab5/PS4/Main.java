/* Se citeste de la tastatura o matrice de numere intregi, de 
dimensiuni cunoscute. Sa se calculeze si afiseze daca matricea 
are toate numerele egale intre ele. Se va defini o metoda separata
ce are ca parametru matricea si returneza true daca matricea are
toate elementele egale.*/

package JavaExercises.Lab5.PS4;
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

        boolean egale = suntToateEgale(a);
        if(egale == true) {
            System.out.println("Sunt toate egale");
        }
        else {
            System.out.println("Nu sunt toate egale");
        }

        sc.close();
    }

    public static boolean suntToateEgale(int a[][]) {
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[0].length; j++) {
                if(a[i][j] != a[0][0]) {
                    return false;
                }
            }
        }
        return true;
    }
}
