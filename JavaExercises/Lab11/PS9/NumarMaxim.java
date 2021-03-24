/* Se da fisierul date.txt, care contine numere intregi(in fiecare linie sunt 
unul sau mai multe numere intregi separate de unul sau mai multe spatii). Sa se
calculeze si afiseze care este cel mai mare numar din fisier.*/

package JavaExercises.Lab11.PS9;
import java.io.*;
import java.util.*;

public class NumarMaxim {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader bfr = null;

        try {
            fr = new FileReader("date.txt");
            bfr = new BufferedReader(fr);
            String linie = bfr.readLine();
            StringTokenizer tk = new StringTokenizer(linie);
            int n = tk.countTokens();
            int max = Integer.parseInt(tk.nextToken());
            int nr;

            for(int i=0; i<n; i++) {
                nr = Integer.parseInt(tk.nextToken());
                if(nr > max) {
                    max = nr;
                }
            }

            for(;;) {
                linie = bfr.readLine();
                if(linie == null) {
                    break;
                }
                tk = new StringTokenizer(linie);
                n = tk.countTokens();
                for(int i=0; i<n; i++) {
                    nr = Integer.parseInt(tk.nextToken());
                    if(nr > max) {
                        max = nr;
                    }
                }
            }
            fr.close();
            bfr.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
        
    }
}
