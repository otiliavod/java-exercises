/* Se citeste de la tastatura ca string un sir de numere intregi separate intre ele prin spatii. Sa se calculeze
maximul dintre aceste numere.*/

package JavaExercises.Lab7.PS6;
import javax.swing.*;
import java.util.*;

public class NumarMaxim {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Sir: ");
        StringTokenizer tk = new StringTokenizer(s);
        int n = tk.countTokens();

        int max = Integer.parseInt(tk.nextToken());
        for(int i=1; i<n; i++) {
            int nrCrt = Integer.parseInt(tk.nextToken());
            if(nrCrt > max) {
                max = nrCrt;
            }
        }

        System.out.println("Maxim: " + max);
    }
}
