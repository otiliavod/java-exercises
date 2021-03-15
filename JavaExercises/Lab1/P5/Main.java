/* Se citeste un numar de la tastatura. Sa se afiseze daca este
termen in sirul lui Fibonacci sau nu.*/

package JavaExercises.Lab1.P5;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N, x1, x2, x0;
        Scanner sc= new Scanner(System.in);
        System.out.print("N = ");
        N = sc.nextInt();
        System.out.print("x1 = ");
        x1 = sc.nextInt();
        System.out.print("x2 = ");
        x2 = sc.nextInt();
        System.out.print("x0 = ");
        x0 = sc.nextInt();

        boolean este = false;

        // n = (n-2) + (n-1)

        for(int i = 1; i < N; i++) {
            x2 = x1 + x0;
            x0 = x1;
            x1 = x2;
            if(x2 == N) {
                este = true;
                break;
            }
        }

        if(este) {
            System.out.println("Este termen");
        }
        else {
            System.out.println("Nu este termen");
        }
        sc.close();
    }
}
