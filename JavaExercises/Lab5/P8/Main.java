/* Se citeste de la tastatura un numar natural N. Se citeste o matrice patrata de dimensiune N, de numere intregi.
Sa se calculeze si afiseze maximul din matrice si linia si coloana in care apare maximul. Se va defini o metoda
separata, ce este apelata din main(), care are ca parametru de intrare matricea si care returneaza trei rezultate:
maximul, linia si coloana in care apare maximul.*/

package JavaExercises.Lab5.P8;
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

        Triplet t = Maxim(a);
        System.out.println("Maximul este: " + t.x + " si se afla pe linia: " + t.y + " si coloana: " + t.z);
        sc.close();
    }

    private static Triplet Maxim(int a[][]) {
        int max = a[0][0];
        int maxL = 0;
        int maxC = 0;
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a.length; j++) {
                if(a[i][j] > max) {
                    max = a[i][j];
                    maxL = i;
                    maxC = j;
                }
            }
        }

        Triplet t = new Triplet();
        t.x = max;
        t.y = maxL;
        t.z = maxC;

        return t;
    }
}
