/* Sa se afiseze din cate incercari se genereaza trei numere
aleatoare egale, in gama 0...19.*/

package JavaExercises.Lab2.PS1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        final int GAMA = 20;
        Random r = new Random();
        int contor = 0;
        for(;;) {
            int a = r.nextInt(GAMA);
            int b = r.nextInt(GAMA);
            int c = r.nextInt(GAMA);
            contor ++;
            if((a == b) && (b == c)) {
                break;
            }
        }
        System.out.println(contor);
    }
}
