/* Se citesc de la tastatura doua numere intregi a si b. Sa se
calculeze cate perechi de numere prime intre ele sunt in 
intervalul [a,b].*/

package JavaExercises.Lab1.P4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a, b;
        int contor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        a = sc.nextInt();

        System.out.print("b = ");
        b = sc.nextInt();

        for(int i=b; i>a; i--) {
            if(suntPrime(i, i-1) == true) {
                contor ++;
            }
        }
        System.out.println("Sunt " + contor + " perechi de numere prime intre ele");
        sc.close();
    }

    private static boolean suntPrime(int x, int y) {
        while(x != y) {
            if(x > y) {
                x = x - y;
            }
            else {
                y = y - x;
            }
        }
        if( x == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}
