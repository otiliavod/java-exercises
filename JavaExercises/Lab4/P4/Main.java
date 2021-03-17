/* Se citeste un numar natural N. Se citesc N numere naturale. Care cifra apare de cele mai multe ori
in scrierea celor N numere?*/

package JavaExercises.Lab4.P4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        N = sc.nextInt();

        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("nr = ");
            a[i] = sc.nextInt();
        }

        int nrAparitiiCifra[] = new int[10];
        for (int i = 0; i < 10; i++) {
            nrAparitiiCifra[i] = 0;
        }

        for (int i = 0; i < N; i++) {
            nrAparitiiCifra[a[i]] = nrAparitiiCifra[a[i]] + 1;
        }

        int max = nrAparitiiCifra[0];
        int val = 0;
        for (int i = 1; i < N; i++) {
            if (nrAparitiiCifra[i] > max) {
                max = nrAparitiiCifra[i];
                val = i;
            }
        }

        System.out.println(val + " apare de " + max + " ori ");
        sc.close();
    }
}
