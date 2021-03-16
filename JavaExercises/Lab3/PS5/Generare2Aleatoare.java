/* Sa se scrie clasa Generare2Aleatoare ce are metoda main care 
apeleaza metoda getDouaNumereDiferite() ce are ca parametru un
numar natural N si care returneaza dpua numere aleatoare diferite
in gama 0...N-1.*/

package JavaExercises.Lab3.PS5;
import java.util.*;

public class Generare2Aleatoare {
    public static void main(String[] args) {
         final int N = 100;
         Dublet d = getDouaNumereDiferite(N);

         System.out.println(d.x);
         System.out.println(d.y);
    }

    private static Dublet getDouaNumereDiferite(int N) {
        Random r = new Random();
        int n1 = r.nextInt(N);
        int n2;

        for(;;) {
            n2 = r.nextInt(N);
            if(n1 != n2) {
                break;
            }
        }

        Dublet d = new Dublet();
        d.x = n1;
        d.y = n2;
        return d;
    }
}
