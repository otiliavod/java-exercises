package JavaExercises.Lab2.PS3;
import java.util.*;

public class TestUmbrela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Diametrul umbrelei: ");
        int d = sc.nextInt();
        Umbrela u = new Umbrela(d);
        boolean este = u.esteMare();
        if(este == true) {
            System.out.println("Diametrul este mare");
        }
        else {
            System.out.println("Diametrul nu este mare");
        }
        sc.close();
    }
}
