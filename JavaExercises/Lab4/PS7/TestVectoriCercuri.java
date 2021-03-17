package JavaExercises.Lab4.PS7;
import java.util.*;

public class TestVectoriCercuri {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        N = sc.nextInt();

        Cerc c[] = new Cerc[N];
        for(int i=0; i<N; i++) {
            System.out.print("raza cercului nr. " + i+1 + " = ");
            int r = sc.nextInt();
            c[i] = new Cerc(r);
        }

        boolean rezultat = suntDiferite(c);
        if(rezultat == true) {
            System.out.println("Sunt toate diferite");
        }
        else {
            System.out.println("Nu sunt toate diferite");
        }

        sc.close();
    }

    private static boolean suntDiferite(Cerc c[]) {
        for(int i=0; i<c.length-1; i++) {
            for(int j=0; j<c.length; j++) {
                if(c[i].esteEgal(c[j]) == true) {
                    return false;
                }
            }
        }
        return true;
    }
}
