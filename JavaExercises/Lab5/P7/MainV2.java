package JavaExercises.Lab5.P7;
import java.util.*;

public class MainV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();

        int a[] = new int[N];
        for(int k=0; k<N; k++) {
            System.out.print("nr = ");
            a[k] = sc.nextInt();
        }
        int M = N % 2 == 0? N/2 : (N + 1) / 2;

        int b[][] = new int[M][M];
        int k = 0;
        for(int i=0; i<M; i++) {
            for(int j=0; j<M; j++) {
                if(k != N) {
                    b[i][j] = a[k];
                    k++;
                }
                else {
                    b[i][j] = -1;
                }
            }
        }

        for(int i=0; i<M; i++) {
            for(int j=0; j<M; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
