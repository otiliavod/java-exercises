// Se citesc de la tastatura doua numere intregi a si b, unde 
//a >= 2. Sa se calculeze cati termeni din sirul lui Fibonacci
//sunt in [a, b].

package JavaExercises.Lab1.PS7;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();

        System.out.println("Numar termeni: " + NrTermeniFib(a, b));
        sc.close();
    }    
    private static int NrTermeniFib(int a, int b) {
        int ante = 1;
        int pen = 1;
        int x = ante + pen;
        while(x < a) {
            ante = pen;
            pen = x;
            x = ante + pen;
        }
        int contor = 0;
        while(x <= b) {
            contor ++;
            ante = pen;
            pen = x;
            x = ante + pen;
        }
        return contor;
    }
}
