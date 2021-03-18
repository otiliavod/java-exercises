/* Se citeste de la tastatura un numar natural N. Se citeste o matrice patrata de dimensiune N. Sa se calculeze
si afiseze cate numere pare sunt deasupra diagonalei secundare a maricii. Se va defini o metoda separata ce are
ca parametru matricea si care returneaza numarul de numere pare de deasupra diagonalei secundare.*/

package JavaExercises.Lab5.P3;
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

        System.out.println("Sunt " + calculPare(a) + " numere pare");
        sc.close();
    }

    private static int calculPare(int a[][]) {
        int contor = 0;
        for(int i=1; i<=a.length-1; i++) {
            for(int j=i; j<=a.length-1; j++) {
                if(a[i][j] % 2 == 0) {
                    contor ++;
                }
            }
        }
        return contor;
    }
}
