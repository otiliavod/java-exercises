package JavaExercises.Lab4.P6;
import java.util.*;

public class TestComplex {
    public static void main(String[] args) {

        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        N = sc.nextInt();

        Complex c[] = new Complex[N];
        for(int i=0; i<N; i++) {
            System.out.print("partea reala " + i+1 + " = ");
            int re = sc.nextInt();
            System.out.print("partea imaginara " + i+1 + " = ");
            int im = sc.nextInt();
            c[i] = new Complex(re, im);
        }

        double mod[] = new double[N];
        for(int i=0; i<N; i++) {
            mod[i] = c[i].modul();
        }

        double max = mod[0];
        int poz = 0;
        for(int i=1; i<N; i++) {
            if(mod[i] > max) {
                max = mod[i];
                poz = i;
            }
        }

        System.out.println("Maximul se afla la pozitia " + poz + " si este: " + max);
        sc.close();
    }
}
