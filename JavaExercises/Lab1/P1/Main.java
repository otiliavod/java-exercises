/* Se citesc de la tastatura doi timpi(pentru fiecare timp se
citesc 3 valori : nr de ore, nr de minute si nr de secunde).
Se va afisa care timp este mai mare. */

package JavaExercises.Lab1.P1;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        int hour1, minute1, second1, hour2, minute2, second2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Hou1: = ");
        hour1 = sc.nextInt();
        System.out.print("Minute1 = ");
        minute1 = sc.nextInt();
        System.out.print("Second1 = ");
        second1 = sc.nextInt();

        System.out.print("Hour2 = ");
        hour2 = sc.nextInt();
        System.out.print("Minute2 = ");
        minute2 = sc.nextInt();
        System.out.print("Second 2 = ");
        second2 = sc.nextInt();

        String a = hour1 + ":" + minute1 + ":" + second1;
        String b = hour2 + ":" + minute2 + ":" + second2;

        int rezultatComparare = timeCompare(a,b);
        afiseazaRezultatComparare(rezultatComparare, a, b);

        sc.close();
    }

    private static void afiseazaRezultatComparare(int rez, String a, String b){
        System.out.println("Dupa comparare:");
        if(rez == 1 ){
            System.out.println("Mai mare este: " + a);
        }
        else if(rez == 0 ){
            System.out.println("Sunt egale");
        }
        else {
            System.out.println("Mai mare este: " + b);
        }
    }

    private static int timeCompare(String a, String b) {
        if (a.compareTo(b) == 1) {
            return 1;
        } else if (a.compareTo(b) == 0) {
            return 0;
        } else {
            return 2;
        }
    }
}
