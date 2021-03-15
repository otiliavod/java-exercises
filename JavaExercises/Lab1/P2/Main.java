/* Se citesc de la tastatura N numere intregi. Sa se calculeze media
 lor aritmetica. */

package JavaExercises.Lab1.P2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N, a;
        int suma = 0;
        double medie;
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        N = sc.nextInt();

        for(int i=0; i < N; i++) { 
            System.out.print("a = ");
            a = sc.nextInt();
            suma = suma + a;
        }

        medie = suma / N;

        System.out.println("Media este: " + medie);
        sc.close();
    }
}
