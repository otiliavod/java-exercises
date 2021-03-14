// Se citeste un numar natural de la tastatura. Sa se afiseze cati divizori are.

package JavaExercises.Lab1.PS2;
import java.util.*;

public class Main {
    public static void main(String [] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("a= ");
        a = sc.nextInt();
        int contor = 2;
        for (int i=2; i<a/2; i++) {
            if(a % i == 0) {
                contor ++;
            }
        }
        System.out.println("Numarul " + a + " are " + contor + " divizori");
        sc.close();
    }
}
