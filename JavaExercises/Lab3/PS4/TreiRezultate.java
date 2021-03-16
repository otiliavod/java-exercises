/* Pentru doua numere intregi a si b sa se calculeze minimul, 
maximul si sa se afiseze daca cele doua numere sunt prime intre
ele, folosind o metoda separata ce are ca parametri doua numere
intregi si care returneaza trei rezultate: minimul, maximul si
un rezultat de tip boolean ce specifica daca numerele sunt prime
intre ele.*/

package JavaExercises.Lab3.PS4;
import java.util.*;

public class TreiRezultate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        Triplet t = getRezultate(a, b);

        System.out.println("Minimul: " + t.x);
        System.out.println("Maximul: " + t.y);
        if(t.z == true) {
            System.out.println("Sunt prime intre ele");
        }
        else {
            System.out.println("Nu sunt prime intre ele");
        }
        sc.close();
    }

    private static Triplet getRezultate(int a, int b) {
        int min;
        if(a < b) {
            min = a;
        }
        else {
            min = b;
        }

        int max;
        if(a > b) {
            max = a;
        }
        else {
            max = b;
        }

        boolean sunt = true;
        for(int i = 2; i <= a; i++) {
            if((a % i == 0) && (b % i == 0)) {
                sunt = false;
                break;
            }
        }

        Triplet t = new Triplet();
        t.x = min;
        t.y = max;
        t.z = sunt;

        return t;
    }
}
