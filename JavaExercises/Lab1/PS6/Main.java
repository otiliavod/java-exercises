// Se citesc de la tastatura trei numere intregi a, b si c. Sa se
//calculeze maximul dintre ele.

package JavaExercises.Lab1.PS6;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        System.out.print("c = ");
        c = sc.nextInt();

        int max = maxim(a, b, c);
        System.out.println("Maximul este: " + max);
        sc.close();
    }

    public static int maxim(int x, int y) {
        if( x > y) {
            return x;
        }
        else {
            return y;
        }
    }

    public static int maxim(int x, int y, int z) {
        int max1 = maxim(x, y);
        return maxim(max1, z);
    }
}
