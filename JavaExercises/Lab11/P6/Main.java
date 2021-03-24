/* Se da fisierul text clasa.txt ce contine pe fiecare linie numele complet al 
unui elev si media lui anuala. Sa se afiseze numele elevului care are cea mai
mare medie.*/

package JavaExercises.Lab11.P6;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader bfr = null;
        
        String nume[] = new String[1000];
        String numeMax = new String();
        double medie[] = new double[1000];
        double max = 0;

        try {
            fr = new FileReader("clasa.txt");
            bfr = new BufferedReader(fr);

            for(;;) {
                String linie = bfr.readLine();
                if(linie == null) {
                    break;
                }

                StringTokenizer tk = new StringTokenizer(linie);
                int n = tk.countTokens();
                for(int i=0; i<n; i++) {
                    nume[i] = JOptionPane(tk.nextToken());
                    medie[i] = Double.parseDouble(tk.nextToken());
                    if(medie[i] > max) {
                        max = medie[i];
                        numeMax = nume[i];
                    }
                }
            }
            fr.close();
            bfr.close();
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
        System.out.println("Elevul cu cea mai mare nota este: " + numeMax + " cu nota: " + max);
    }

    private static String JOptionPane(String nextToken) {
        return null;
    }
}
