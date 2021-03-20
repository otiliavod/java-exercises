/* Se citeste de la tastatura o propozitie. Sa se afiseze cuvantul de lungime maxima.*/

package JavaExercises.Lab7.PS5;
import javax.swing.*;
import java.util.*;

public class Cuvinte_1 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Sir: ");
        String cuvantMax = "";
        int lMax = 0;

        StringTokenizer tk = new StringTokenizer(s);
        int n = tk.countTokens();

        for(int i=0; i<n; i++) {
            String cuvantCrt = tk.nextToken();
            int lCrt = cuvantCrt.length();
            if(lCrt > lMax) {
                cuvantMax = cuvantCrt;
                lMax = lCrt;
            }
        }

        System.out.println("Cuvant de lungime maxima: " + cuvantMax);
    }
}
