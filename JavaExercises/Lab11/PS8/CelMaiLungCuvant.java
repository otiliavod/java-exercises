/* Sa se afiseze care este cel mai lung cuvant dintr-un fisier text dat. Se 
considera ca in fisier nu exista cuvinte despartite in silabe, la cap de rand.*/

package JavaExercises.Lab11.PS8;
import java.io.*;
import java.util.*;

public class CelMaiLungCuvant {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader bfr = null;
        String cuvantMax = "";
        int lungimeMax = 0;

        try {
            fr = new FileReader("referat.txt");
            bfr = new BufferedReader(fr);

            for(;;) {
                String linie = bfr.readLine();
                if(linie == null) {
                    break;
                }
                StringTokenizer tk = new StringTokenizer(linie);
                int n = tk.countTokens();
                for(int i=0; i<n; i++) {
                    String cuvant = tk.nextToken();
                    int lungime = cuvant.length();
                    if(lungime > lungimeMax) {
                        lungimeMax = lungime;
                        cuvantMax = cuvant;
                    }
                }
            }
            fr.close();
            bfr.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
        System.out.println("Cel mai lung cuvant: " + cuvantMax);
    }
}
