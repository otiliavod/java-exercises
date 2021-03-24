/* Se citeste un numar natural N. Se citesc numele a N fisiere text. Sa se afiseze
in care fisier apare de cele mai multe ori caracterul A.*/

package JavaExercises.Lab11.P3;
import java.io.*;
import java.util.StringTokenizer;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Nume: "));
        String numeF[] = new String[N];
        FileReader fr = null;
        BufferedReader bfr = null;
        int nrAparitii[] = new int[N];

        for(int i=0; i<N; i++) {
            numeF[i] = JOptionPane.showInputDialog("Nume fisier: ");
        }

        for(int i=0; i<N; i++) {
            try {
                fr = new FileReader(numeF[i]);
                bfr = new BufferedReader(fr);

                for(;;) {
                    String linie = bfr.readLine();
                    if(linie == null) {
                        break;
                    }
                    StringTokenizer tk = new StringTokenizer(linie);
                    int n = tk.countTokens();
                    for(int j=0; j<n; j++) {
                        if(linie.charAt(j) == 'A') {
                            nrAparitii[i] ++;
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

        int max = nrAparitii[0];
        int poz = 0;
        for(int i=0; i<N; i++) {
            if(nrAparitii[i] > max) {
                max = nrAparitii[i];
                poz = i;
            }
        }
        System.out.println("'A' apare de " + max + " ori in " + poz);
    }
}
