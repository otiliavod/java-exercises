/* Se citeste o propozitie de la tastatura. Sa se afiseze daca toate cuvintele
sunt diferite intre ele sau nu.*/

package JavaExercises.Lab7.P4;
import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Sir: ");
        StringTokenizer tk = new StringTokenizer(s);
        int n = tk.countTokens();
        String s1[] = new String[n];
        int j = 0;

        for(int i=0; i<n; i++) {
            String cuvantCurent = tk.nextToken();
            s1[j] = cuvantCurent;
            j++;
        }

        for(int i=0; i<n; i++) {
            if(s1[i].compareTo(s1[i+1]) == 0) {
                System.out.println("Nu sunt toate diferite");
                return;
            }
            System.out.println("Sunt toate diferite");
        }
    }
}
