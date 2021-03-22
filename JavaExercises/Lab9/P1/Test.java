package JavaExercises.Lab9.P1;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();

        Forma f[] = new Forma[N];
        Random r = new Random();
        int a, l, L, h;

        for(int i=0; i<N; i++) {
            int caz = r.nextInt(2);
            if(caz == 0) {
                System.out.print("Latura: ");
                a = sc.nextInt();
                f[i] = new Cub(a);
            }
            else {
                System.out.print("Lungimea: ");
                l = sc.nextInt();
                System.out.print("Latimea: ");
                L = sc.nextInt();
                System.out.print("Inaltimea: ");
                h = sc.nextInt();
                f[i] = new Paralelipiped(l, L, h);
            }
        }

        for(int i=0; i<N; i++) {
            System.out.println("Obiectul din: " + f[i].getClass() + " are aria: " + f[i].arieTotala() + " si volumul: " + f[i].volum());
        }

        sc.close();
    }
}
