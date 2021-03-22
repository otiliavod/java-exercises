package JavaExercises.Lab9.PS4;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();

        Forma2D f[] = new Forma2D[N];
        Random r = new Random();
        int raza, x, y;

        for(int i=0; i<N; i++) {
            int caz = r.nextInt(3);
            if(caz == 0) {
                System.out.print("Raza: ");
                raza = sc.nextInt();
                f[i] = new Cerc(raza);
            }
            else if(caz == 1) {
                System.out.print("Latura patratului: ");
                x = sc.nextInt();
                f[i] = new Patrat(x);
            }
            else {
                System.out.print("Lungimea dreptunghiului: ");
                x = sc.nextInt();
                System.out.print("Latimea dreptunghiului: ");
                y = sc.nextInt();
            }
        }

        for(int i=0; i<N; i++) {
            System.out.println("Obiectul din " + f[i].getClass() + " are aria: " + f[i].arie() + " si perimtrul: " + f[i].perimetru());
        }
    }
}
