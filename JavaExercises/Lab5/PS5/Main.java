/* Se citeste de la tastatura un numar natural N. Se citeste o 
matrice patrata de numere naturale, de dimensiune N. Sa se 
calculeze si afiseze cate numere pare sunt in matrice.*/

package JavaExercises.Lab5.PS5;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numar linii: ");
        int N = sc.nextInt();

        int a[][] = new int[N][N];
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                System.out.print("nr = ");
                a[i][j] = sc.nextInt();
            }
        }

        int rezultat = cateNumerePare(a);
        System.out.println("Sunt " + rezultat + " numere pare");

        sc.close();
    }

    private static int cateNumerePare(int a[][]) {
        int contor = 0;
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[0].length; j++) {
                if(a[i][j] % 2 == 0) {
                    contor ++;
                }
            }
        }
        return contor;
    }
}
