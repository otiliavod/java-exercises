package JavaExercises.Lab5.PS8;
import java.util.*;

public class TestPunct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();

        Punct a[][] = new Punct[N][N];
        int x, y;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                System.out.print("punctul curent: x= ");
                x = sc.nextInt();
                System.out.print("punctul curent: y= ");
                y = sc.nextInt();
                a[i][j] = new Punct(x, y);
            }
        }

        int nrLinie = -1;
        int maxEgale = 1;
        for(int i=0; i<N; i++) {
            int nrEgale = 0;
            for(int j=0; j<N; j++) {
                if(a[i][j].getX() == a[i][j].getY()) {
                    nrEgale ++;
                }
                if(nrEgale > maxEgale) {
                    maxEgale = nrEgale;
                    nrLinie = i;
                }
            }
        }

        System.out.println("Linia " + nrLinie + " are " + maxEgale + " puncte cu x=y");
        sc.close();
    }
}
