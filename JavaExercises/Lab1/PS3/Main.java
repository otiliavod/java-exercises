// Se citeste un numar natural a. Sa se afiseze daca este patrat
//perfect sau nu.

package JavaExercises.Lab1.PS3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        a = sc.nextInt();
        
        double radical = Math.sqrt(a);
        if((int)radical * (int)radical == a) {
            System.out.println("Este patrat perfect");
        }
        else {
            System.out.println("Nu este patrat perfect");
        }
        sc.close();
    }
}
