/* Se citeste un numar de la tastatura. Sa se afiseze daca este
termen in sirul lui Fibonacci sau nu.*/

package JavaExercises.Lab1.P5;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        N = sc.nextInt();

        int nr2;
        int nr0 = 0;
        int nr1 = 1;

        boolean este = false;

        if (N != 0) {
            for (int i = 1; i <= N; i++) {
                nr2 = nr1 + nr0;
                nr0 = nr1;
                nr1 = nr2;
                if (nr2 == N) {
                    este = true;
                    break;
                }
            }
        } else {
            este = true;
        }

        if (este) {
            System.out.println("Este");
        } else {
            System.out.println("Nu este");
        }
        sc.close();
    }
}
