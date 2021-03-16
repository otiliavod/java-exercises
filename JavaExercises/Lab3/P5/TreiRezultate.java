/* Pentru trei numere intregi a, b si c sa se calculeze maximul,
minimul si media lor aritmetica folosind o metoda separata ce are
ca parametri trei numere intregi si care returneaza trei rezultate:
maximul, minimul si media aritmetica a celor trei numere.*/

package JavaExercises.Lab3.P5;
import java.util.*;

public class TreiRezultate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.print("c = ");
        int c = sc.nextInt();

        Triplet t = getRezultate(a, b, c);

        System.out.println("Maximul: " + t.a);
        System.out.println("Minimul: " + t.b);
        System.out.println("Media: " + t.c);

        sc.close();
    }

    private static Triplet getRezultate(int x, int y, int z) {
        int max;
        max = x;
        if(y > max) {
            max = y;
        }
        if(z > max) {
            max = z;
        }

        int min;
        min = x;
        if(y < min) {
            min = y;
        }
        if(z < min) {
            min = z;
        }

        int suma = x + y + z;
        double medie = suma / 3;

        Triplet t = new Triplet();
        t.a = max;
        t.b = min;
        t.c = medie;

        return t;
    }    
}
