// Se citesc de la tastatura coordonatele x si y pentru doua 
//puncte din plan. Sa se calculeze distanta intre ele.

package JavaExercises.Lab1.PS4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        Scanner sc = new Scanner(System.in);
        System.out.print("x1 = ");
        x1 = sc.nextInt();
        System.out.print("y1 = ");
        y1 = sc.nextInt();
        System.out.print("x2 = ");
        x2 = sc.nextInt();
        System.out.print("y2 = ");
        y2 = sc.nextInt();

        double rez = distanta(x1, y1, x2, y2);
        System.out.println("Distanta = " + rez);
        sc.close();
    }

    public static double distanta(int x1, int y1, int x2, int y2) {
        int dx = x1 - x2;
        int dy = y1 - y2;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
