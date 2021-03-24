/* Se da fisierul date.txt, care contine numere intregi. Sa se afiseze daca toate
numerele din fisier sunt diferite intre ele sau nu.*/

package JavaExercises.Lab11.P5;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader bfr = null;
    
        int numere[] = new int[1000];
        int N = 0; //nr de numere;

        try {
            fr = new FileReader("date.txt");
            bfr = new BufferedReader(fr);

            for(;;) {
                String linie = bfr.readLine();
                if(linie == null) {
                    break;
                }
                StringTokenizer tk = new StringTokenizer(linie);
                int n = tk.countTokens();
                int nr;

                for(int i=0; i<n; i++) {
                    nr = Integer.parseInt(tk.nextToken());
                    numere[i] = nr;
                    N++;
                }
            }
            fr.close();
            bfr.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }

        for(int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++) {
                if(numere[i] == numere[j]) {
                    System.out.println("Nu sunt toate numerele diferite");
                    return;
                }
                System.out.println("Toate numerele sunt diferite");
            }
        }
    }
}
