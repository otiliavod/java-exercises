package JavaExercises.Lab9.PS3;
import java.util.*;

public class TestCercuri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();

        Cerc c[] = new Cerc[N];
        Random r = new Random();

        int raza, x, y;
        for(int i=0; i<N; i++) {
            int caz = r.nextInt(2);
            if(caz == 0) {
                System.out.print("Raza: ");
                raza = sc.nextInt();
                c[i] = new Cerc(raza);
            }
            else {
                System.out.print("Raza: ");
                raza = sc.nextInt();
                System.out.print("X: ");
                x = sc.nextInt();
                System.out.print("Y: ");
                y = sc.nextInt();
                c[i] = new CercExtins(raza, x, y);
            }
        }

        for(int i=0; i<N; i++) {
            c[i].afisare();
        }

        sc.close();
    }
}
