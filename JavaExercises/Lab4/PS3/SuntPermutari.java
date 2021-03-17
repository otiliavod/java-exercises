/* Se citesc de la tastatura doi vectori a si b, ce au aceeasi
dimensiune, N. Sa se afiseze daca vectorul b este o permutare
a vectorului a.*/

package JavaExercises.Lab4.PS3;
import java.util.*;

public class SuntPermutari {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        N = sc.nextInt();

        int a[] = new int[N];
        int b[] = new int[N];

        System.out.println("Citire vector a: ");

        for(int i=0; i<N; i++) {
            System.out.print("nr = ");
            a[i] = sc.nextInt();
        }

        System.out.println("Citire vector b: ");

        for(int i=0; i<N; i++) {
            System.out.print("nr = ");
            b[i] = sc.nextInt();
        }

        Arrays.sort(a); //sortare vector
        Arrays.sort(b);

        //Comparam vectorii:
        boolean suntPerm = true;
        for(int i=0; i<N; i++) {
            if(a[i] != b[i]) {
                suntPerm = false;
                break;
            }
        }
        if(suntPerm) {
            System.out.println("Sunt");
        }
        else {
            System.out.println("Nu sunt");
        }
        sc.close();
    }
}
