/* Se citeste de la tastatura numele unui fisier text. Sa se calculeze si afiseze
care este linia din fisier care contine cele mai multe cuvinte.*/

package JavaExercises.Lab11.P7;
import java.io.*;
import java.util.StringTokenizer;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String numeF = JOptionPane.showInputDialog("Nume fisier: ");
        FileReader fr = null;
        BufferedReader bfr = null;
        String linieMax = "";

        try {
            fr = new FileReader(numeF);
            bfr = new BufferedReader(fr);
            
            for(;;) {
                String linie = bfr.readLine();
                if(linie == null) {
                    break;
                }
                StringTokenizer tk = new StringTokenizer(linie);
                int n = tk.countTokens();
                int max = 0;
                if(n > max) {
                    max = n;
                    linieMax = linie;
                }
            }
            fr.close();
            bfr.close();
            System.out.println(linieMax);
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
