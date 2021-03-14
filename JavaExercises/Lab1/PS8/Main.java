// Se citesc de la tastatura doua numere intregi a si b, unde 
//a >= 2. Sa se calculeze care este cel mai amre numar prim
//din intervalul [a, b].Daca nu exista, se va afisa ca nu exista.

package JavaExercises.Lab1.PS8;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();

        int rez = maxPrim(a, b);
        if(rez == -1) {
            System.out.println("Nu exista");
        }
        else{
            System.out.println("Cel mai mare numar prim este: " + rez);
         }
         sc.close();
    }

    private static int maxPrim(int a, int b) {
        for(int i = b; i >= a; i--) {
            if(estePrim(i)) {
                return 1;
            }
        }
        return -1;
    }

    private static boolean estePrim(int nr) {
        for(int i = 2; i <= Math.sqrt(nr); i++) {
            if(nr % i == 0) {
                return false;
            }
        }
        return true;
    }
}
