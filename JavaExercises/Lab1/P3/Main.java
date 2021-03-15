/* Se citesc de la tastatura N numere intregi. Sa se calculeze
si afiseze daca sunt toate egale intre ele sau nu.*/

package JavaExercises.Lab1.P3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N, a, b;
        boolean sunt = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        N = sc.nextInt();
        System.out.print("a = ");
         a = sc.nextInt();

        for(int i=1; i<N; i++) {
            System.out.print("b = ");
            b = sc.nextInt();
            if(b != a) {
                sunt = false;
                break;
            } 
        }
        if( sunt == true) {
            System.out.println("Sunt egale");
        }
        else {
            System.out.println("Nu sunt egale");
        }
        sc.close();
    }
}
