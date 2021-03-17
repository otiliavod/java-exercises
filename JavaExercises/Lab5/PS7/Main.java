/* Se citeste de la tastatura un numar natural N. Se citeste o 
matrice patrata de numere intregi, de dimensiune N. Sa se calculeze
si afiseze daca matricea are toate elementele in ordine crescatoare.
Se va defini o metoda separata ce are ca parametru matricea si 
care returneaza true daca matricea are toate elementele in ordine
crescatoare.*/

package JavaExercises.Lab5.PS7;
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

        boolean rezultat = suntCrescatoare(a);
        if(rezultat) {
            System.out.println("Sunt in ordine crescatoare");
        }
        else {
            System.out.println("Nu sunt in ordine crescatoare");
        }

        sc.close();
    }

    private static boolean suntCrescatoare(int a[][]) {
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a.length-1; j++) {
                if(a[i][j] > a[i][j+1]) {
                    return false;
                }
                if(i < a.length-1) {
                    if(a[i][a.length-1] > a[i+1][0]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
