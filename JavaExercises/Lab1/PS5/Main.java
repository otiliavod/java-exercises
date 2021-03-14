// Se citesc de la tastatura N numere intregi. Sa se calculeze
//maximul dintre ele.

package JavaExercises.Lab1.PS5;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        N = sc.nextInt();
        
        int a;
        System.out.print("a = ");
        a = sc.nextInt();

        int max = a;
        for(int i = 2; i<=N; i++) {
            System.out.print("a = ");
            a = sc.nextInt();
            if(a > max) {
                max = a;
            }
        }
        System.out.println("Maximul este: " + max);
        sc.close();
    }
}
