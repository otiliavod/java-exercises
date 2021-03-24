/* Se da fisierul text date.txt care contine numere intregi. Sa se calculeze si afiseze
media aritmetica a numerelor din fisier.*/

package JavaExercises.Lab11.P4;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader bfr = null;
        int medie;
        int sumaL = 0;
        int sumaTotala = 0;
        int nrLinii = 0;

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
                    sumaL = sumaL + nr;
                }
                nrLinii ++;
                sumaTotala = sumaTotala + sumaL;
            }
            fr.close();
            bfr.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
        medie = sumaTotala / nrLinii;
        System.out.println("Media este: " + medie);
    }
}
