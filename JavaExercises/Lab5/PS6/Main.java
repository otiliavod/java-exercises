/* Se citeste de la tastatura un numar natural N. Se citeste o 
matrice patrata de numere intregi, de dimensiune N. Sa se calculeze
si afiseze cate numere pare sunt sub diagonala principala a matricii.
Se va defini o metoda separata ce are ca parametru matricea si
care returneaz numarul de numere pare de sub diagonala matricii.*/

package JavaExercises.Lab5.PS6;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numarul de linii: ");
        int N = sc.nextInt();

        int a[][] = new int[N][N];
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                System.out.print("nr = ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sunt " + calculPare(a) + " numere pare");
        sc.close();
    }

    private static int calculPare(int a[][]) {
        int contor = 0;
        for(int i=1; i<a.length; i++) {
            for(int j=0; j<i; j++) {
                if(a[i][j] % 2 == 0) {
                    contor ++;
                }
            }
        }
        return contor;
    }
}
