/* Se da fisierul date.txt, care contine numere intregi. Sa se calculeze si afiseze
care este cel mai mare numar prim din fisier.*/

package JavaExercises.Lab11.P8;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader bfr = null;

        try {
            fr = new FileReader("date.txt");
            bfr = new BufferedReader(fr);
            int max = 0;

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
                    if(estePrim(nr)) {
                        if(nr > max) {
                            max = nr;
                        }
                    }
                }
            }
            fr.close();
            bfr.close();
            System.out.println("Cel mai mare numar prim: " + max);
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }

    private static boolean estePrim(int nr) {
        for(int i = 2; i <= Math.sqrt(nr); i++) {
            if(nr % i == 0) {
                return false;
            }
        }
        return true;
    }
}
