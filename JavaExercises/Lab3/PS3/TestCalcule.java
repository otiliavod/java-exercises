package JavaExercises.Lab3.PS3;
import java.util.*;

public class TestCalcule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();

        Calcule.afisareDivizori(a);
        System.out.println("Are " + Calcule.nrDivizori(a) + " divizori");
        if(Calcule.estePrim(a) == true) {
            System.out.println("Este numar prim");
        }
        else {
            System.out.println("Nu este numar prim");
        }
        sc.close();
    }
}
