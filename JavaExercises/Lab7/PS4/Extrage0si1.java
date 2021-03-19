/* Se citeste de la tastatura un sir care contine numai biti, fiecare bit separat de urmatorul prin unul sau 
mai multe spatii. Sa se afiseze daca sunt mai multi biti de 0 sau mai multi biti de 1.*/

package JavaExercises.Lab7.PS4;
import javax.swing.*;
import java.util.*;

public class Extrage0si1 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Sir: ");
        StringTokenizer tk = new StringTokenizer(s);

        int n = tk.countTokens();
        int n_0 = 0;

        for(int i=0; i<n; i++) {
            int bit = Integer.parseInt(tk.nextToken());
            if(bit == 0) {
                n_0 ++;
            }
        }

        int n_1 = n - n_0;
        if(n_0 > n_1) {
            System.out.println("Sunt mai multe valori de 0");
        }
        else if(n_0 < n_1) {
            System.out.println("Sunt mai multe valori de 1");
        }
        else {
            System.out.println("Sunt numar egal de valori");
        }
    }
}
