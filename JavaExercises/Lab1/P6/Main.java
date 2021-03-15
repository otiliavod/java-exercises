/* Se citesc de la tastatura trei numere. Pentru a ilustra
notiunea de polimorfism parametric, calculati cmmdc al primelor
doua numere si cmmdc pentru toate trei, scriind doua metode care
au acelasi nume, dar care difera prin numarul de parametri.*/

package JavaExercises.Lab1.P6;
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

        int rez1 = cmmdc(a, b);
        int rez2 = cmmdc(a, b, c);
        System.out.println("Primul rezultat: " + rez1);
        System.out.println("Al doilea rezultat: " + rez2);

        sc.close();
    }

    private static int cmmdc(int x, int y) {
        while(x != y) {
            if(x > y) {
                x = x - y;
            }
            else {
                y = y - x;
            }
        }
        return x;
    }

    private static int cmmdc(int x, int y, int z) {
        while(x != y) {
            if(x > y) {
                x = x - y;
            }
            else {
                y = y - x;
            }
        }
        while(x != z) {
            if(x > z) {
                x = x - z;
            }
            else {
                z = z - x;
            }
        }
        return x;
    }
}
